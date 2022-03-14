package ir.vscodemobile.ninjacoder;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Parameter;
import java.util.ArrayList;
import java.util.List;

public final class Reflector {
	private boolean filterFileds;
	private Class<?> thisClass;
	private String parameterName;
	private ClassToString superClassesAndInterfaces;
	private FieldToString[] fieldsToString = {};
	private MethodToString[] methodsToString = {};
	private ConstructorToString[] constructorsToString = {};
	
	public static Reflector NORMAL(Class<?> _Class, String customParameterName) {
		return new Reflector(_Class, false, customParameterName);
	}
	
	public static Reflector FILTER(Class<?> _Class, String customParameterNamer) {
		return new Reflector(_Class, true, customParameterNamer);
	}
	
	public ClassToString getReflectClass() {
		return superClassesAndInterfaces;
	}
	
	public FieldToString[] getFields() {
		return fieldsToString;
	}
	
	public MethodToString[] getMethods() {
		return methodsToString;
	}
	
	public ConstructorToString[] getConstructors() {
		return constructorsToString;
	}
	
	public static final class ClassToString {
		private String type;
		private String className;
		private String[] superClasses = {};
		private String declaration;
		private String superClass;
		private String interfaces = "";
		private boolean containsInterfaces = false;
		private boolean containsSuperClass = false;
		
		public ClassToString(Class<?> _Class) {
			className = _Class.getCanonicalName();
			declaration = _Class.toGenericString();
			ArrayList<String> L_superClasses = new ArrayList<>();
			
			if(_Class.isEnum()) {type = "enum";} else {if(_Class.isAnnotation()) {type = "annotation";} else {if(_Class.isInterface()) {type = "interface";} else {type = "class";}}}
			try {
				superClass = _Class.getSuperclass().toGenericString().substring(_Class.getSuperclass().toGenericString().lastIndexOf(" ") + 1);
				L_superClasses.add(_Class.getSuperclass().getName());
				containsSuperClass = true;
			}catch(NullPointerException e) {
				
			}
			
			for(Class<?> interfaceClass : _Class.getInterfaces()) {
				interfaces = interfaces.concat(interfaceClass.toGenericString().substring(interfaceClass.toGenericString().lastIndexOf(" ") + 1) + ", ");
				L_superClasses.add(interfaceClass.getName());
			}
			
			try {
				interfaces = new StringBuilder(interfaces).delete(interfaces.length() - 2, interfaces.length()).toString();
				containsInterfaces = true;
			}catch(StringIndexOutOfBoundsException e) {
				
			}
			superClasses = L_superClasses.toArray(new String[L_superClasses.size()]);
		}
		
		public String getType() {
			return type;
		}
		
		public boolean containsSuperClass() {
			return containsSuperClass;
		}
		
		public boolean containsInterfaces() {
			return containsInterfaces;
		}
		
		public String getDeclaration() {
		    return declaration;	
		}
		
		public String[] getSuperClassesToArray() {
			return superClasses;
		}
		
		public String getSuperClass() {
		    return superClass;	
		}
		
		public String getInterfaces() {
		    return interfaces;	
		}
		
		public String getName() {
			return className;
		}
		
		@Override
		public String toString() {
			String text = "";
			if(containsSuperClass) {
				text = text.concat(declaration + " extends " + superClass);
				if(containsInterfaces) {
					text = text.concat(" implements " + interfaces);
				}
			}else {
				if(containsInterfaces) {
					text = declaration + " extends " + interfaces;	
				}else {
					text = declaration;
				}
			}
			return text;
		}
	}
	
	public static final class FieldToString {
		private String fieldDeclaration;
		private String fieldName;
		private String fieldTypeName;
		private String genericTypeName;
		
		public FieldToString(Field _Field) {
			String L_fieldDeclaration = _Field.toGenericString();
			fieldDeclaration = L_fieldDeclaration.substring(0, L_fieldDeclaration.lastIndexOf(" "));
			fieldName = _Field.getName();
			fieldTypeName = _Field.getType().getTypeName();
			genericTypeName = _Field.getGenericType().getTypeName();
		}
		
		public boolean isPublic() {
			try {
				return fieldDeclaration.substring(0, fieldDeclaration.indexOf(" ")).equals("public")? true : false;
			}catch(StringIndexOutOfBoundsException e) {
				return fieldDeclaration.equals("public")? true : false;
			}
		}
		
		public boolean isProtected() {
			try {
				return fieldDeclaration.substring(0, fieldDeclaration.indexOf(" ")).equals("protected")? true : false;
			}catch(StringIndexOutOfBoundsException e) {
				return fieldDeclaration.equals("protected")? true : false;
			}
		}
		
		public String getName() {
			return fieldName;
		}
		
		public String getTypeName() {
			return fieldTypeName;
		}
		
		public String getGenericTypeName() {
			return genericTypeName;
		}
		
		@Override
		public String toString() {
			return fieldDeclaration + " " + fieldName + ";";
		}
	}
	
	public static final class MethodToString {
		private String[] S_parametersTypeName = {};
		private String[] S_parametersGenericsTypeName = {};
		private String S_genericReturnTypeName;
		private String S_declaration = "";
		private String S_returnType = "";
		private String S_name = "";
		private String S_blockParameters = "";
		private String S_methodThrowns = "";
		
		public MethodToString(Method _Method, String customParameterName) {
			String methodToStringOnlyDeclaration = null;
		    String textDeclaration = null;
			String exactDeclaration = null;
		    String methodThroweds = null;
		    
			try {
				methodToStringOnlyDeclaration = _Method.toGenericString().substring(0, _Method.toGenericString().indexOf("("));
				methodThroweds = _Method.toGenericString().substring(_Method.toGenericString().indexOf("throws"));
			}catch(StringIndexOutOfBoundsException e) {
				methodThroweds = "";
			}
			textDeclaration = methodToStringOnlyDeclaration.substring(0, methodToStringOnlyDeclaration.lastIndexOf("."));
			exactDeclaration = textDeclaration.substring(0, textDeclaration.lastIndexOf(" "));
			S_declaration = exactDeclaration;
			S_returnType = _Method.getReturnType().getTypeName();
			S_genericReturnTypeName = _Method.getGenericReturnType().getTypeName();
			if(S_genericReturnTypeName.contains("<")? !new StringBuilder(S_genericReturnTypeName).delete(S_genericReturnTypeName.indexOf("<"), S_genericReturnTypeName.lastIndexOf(">") + 1).toString().equals(S_returnType)? true : false : !S_genericReturnTypeName.equals(S_returnType)) {
				S_genericReturnTypeName = S_genericReturnTypeName.contains("[]")? S_genericReturnTypeName + " array of " + S_genericReturnTypeName.substring(0, S_genericReturnTypeName.indexOf("[")) + " extends " + S_returnType : S_genericReturnTypeName + " extends " + S_returnType;
			}
			S_name = _Method.getName();
			
			String parametersToString = "";
			ArrayList<String> parametersTypeName = new ArrayList<>();
			ArrayList<String> parametersGenericTypeName = new ArrayList<>();
			
			for(Parameter _Parameter : _Method.getParameters()) {
				parametersToString = parametersToString.concat(_Parameter.toString().replace("arg", customParameterName) + ", ");
				String parameterTypeName = _Parameter.getType().getTypeName();
				
				parametersTypeName.add(parameterTypeName);
				parametersGenericTypeName.add(_Parameter.getParameterizedType().getTypeName());
			}
			
			for(int i = 0; i < parametersTypeName.size(); i++) {
				String genericParameter = parametersGenericTypeName.get(i);
				String trimmedGenericParameter = genericParameter.contains("<")? new StringBuilder(genericParameter).delete(genericParameter.indexOf("<"), genericParameter.lastIndexOf(">") + 1).toString() : genericParameter;
				String element = "";
				if(!trimmedGenericParameter.equals(parametersTypeName.get(i))) {
					element = genericParameter.contains("[]")? genericParameter + " array of " + new StringBuilder(genericParameter).delete(genericParameter.length() - 2, genericParameter.length()) + " extends "  + parametersTypeName.get(i).substring(0, parametersTypeName.get(i).indexOf("[")) : genericParameter + " extends " + parametersTypeName.get(i);
					element = element.concat(":" + parametersTypeName.get(i));
					parametersGenericTypeName.set(i, element);
				}else {
					element = element.concat(parametersGenericTypeName.get(i) + ":" + parametersTypeName.get(i));
					parametersGenericTypeName.set(i, element);
				}
			}
			
			S_parametersTypeName = parametersTypeName.toArray(new String[parametersTypeName.size()]);
			S_parametersGenericsTypeName = parametersGenericTypeName.toArray(new String[parametersGenericTypeName.size()]);
			S_blockParameters = parametersToString.equals("")? "()" : "(" + new StringBuilder(parametersToString).delete(parametersToString.length() - 2, parametersToString.length()).toString() + ")";
			S_methodThrowns = methodThroweds;
		}
		
		public String getMethodDeclaration() {
			return S_declaration;
		}
		
		public String getReturnTypeName() {
			return S_returnType;
		}
		
		public String getGenericReturnTypeName() {
			return S_genericReturnTypeName;
		}
		
		public String getName() {
		    return S_name;	
		}
		
		public String[] getParametersTypeName() {
			return S_parametersTypeName;
		}
		
		public String[] getGenericParametersTypeName() {
			return S_parametersGenericsTypeName;
		}
		
		public String getParameters() {
			return S_blockParameters;
		}
		
		public boolean isPublic() {
			try {
				return S_declaration.substring(0, S_declaration.indexOf(" ")).equals("public")? true : false;
			}catch(StringIndexOutOfBoundsException e) {
				return S_declaration.equals("public")? true : false;
			}
		}
		
		public boolean isProtected() {
			try {
				return S_declaration.substring(0, S_declaration.indexOf(" ")).equals("protected")? true : false;
			}catch(StringIndexOutOfBoundsException e) {
				return S_declaration.equals("protected")? true : false;
			}
		}
		
		public String getMethodThrowns() {
			return S_methodThrowns;
		}
		
		@Override
		public String toString() {
			return S_declaration + " " + S_name + S_blockParameters + " {...} " + S_methodThrowns;
		}
	}
	
	public static final class ConstructorToString {
		private String[] parametersTypeName = {};
		private String[] parametersGenericTypeName = {};
		private String constructorDeclaration;
		private String constructorName;
		private String constructorParameters = "";
		private String constructorThrowns;
		
		
		public ConstructorToString(Constructor _Constructor, String customParameterName) {
			String completeConstructor = _Constructor.toGenericString();
			String constructorOnlyDeclaration = null;
			
			try {
				String trimmedDeclaration = completeConstructor.substring(0, completeConstructor.indexOf("("));
				constructorDeclaration = trimmedDeclaration.substring(0, trimmedDeclaration.lastIndexOf(" "));
			}catch(StringIndexOutOfBoundsException e) {
				try {
					constructorDeclaration = completeConstructor.substring(0, completeConstructor.indexOf("("));
				}catch(Exception e2) {
					System.out.println("an error ocurred to build constructor");
				}
			}
			constructorName = _Constructor.getName();
			
			ArrayList<String> L_parametersTypeName = new ArrayList<>();
			ArrayList<String> L_parametersGenericTypeName = new ArrayList<>();
			
			for(Parameter _Parameter : _Constructor.getParameters()) {
				constructorParameters = constructorParameters.concat(_Parameter.toString().replace("arg", customParameterName) + ", ");
				L_parametersTypeName.add(_Parameter.getType().getTypeName());
				L_parametersGenericTypeName.add(_Parameter.getParameterizedType().getTypeName());
			}
			constructorParameters = constructorParameters.equals("")? "()" : "(" + new StringBuilder(constructorParameters).delete(constructorParameters.length() - 2, constructorParameters.length()).toString() + ")";
			for(int i = 0; i < L_parametersGenericTypeName.size(); i++) {
				String genericParameter = L_parametersGenericTypeName.get(i);
				String element = "";
				if(genericParameter.contains("<")? !new StringBuilder(genericParameter).delete(genericParameter.indexOf("<"), genericParameter.lastIndexOf(">") + 1).toString().equals(L_parametersTypeName.get(i))? true : false : !genericParameter.equals(L_parametersTypeName.get(i))? true : false) {
					element = genericParameter.contains("[]")? genericParameter + " array of " + genericParameter.substring(0, genericParameter.indexOf("[")) + " extends " + L_parametersTypeName.get(i).substring(0, L_parametersTypeName.get(i).indexOf("[")): genericParameter + " extends " + L_parametersTypeName.get(i);
					element = element.concat(":" + L_parametersTypeName.get(i));
					L_parametersGenericTypeName.set(i, element);
				}else {
					element = element.concat(L_parametersGenericTypeName.get(i) + ":" + L_parametersTypeName.get(i));
					L_parametersGenericTypeName.set(i, element);
				}
			}
			parametersTypeName = L_parametersTypeName.toArray(new String[L_parametersTypeName.size()]);
			parametersGenericTypeName = L_parametersGenericTypeName.toArray(new String[L_parametersGenericTypeName.size()]);
			try {
				constructorThrowns = completeConstructor.substring(completeConstructor.indexOf("throws"));
			}catch(StringIndexOutOfBoundsException e) {
				constructorThrowns = "";
			}
		}
		
		public boolean isPublic() {
			try {
				return constructorDeclaration.substring(0, constructorDeclaration.indexOf(" ")).equals("public")? true : false;
			}catch(StringIndexOutOfBoundsException e) {
				return constructorDeclaration.equals("public")? true : false;
			}
		}
		
		public boolean isProtected() {
			try {
				return constructorDeclaration.substring(0, constructorDeclaration.indexOf(" ")).equals("protected")? true : false;
			}catch(StringIndexOutOfBoundsException e) {
				return constructorDeclaration.equals("protected")? true : false;
			}
		}
		
		public String getConstructorDeclaration() {
			return constructorDeclaration;
		}
		
		public String getParameters() {
			return constructorParameters;
		}
		
		public String getName() {
			return constructorName;
		}
		
		public String[] getParametersTypeName() {
			return parametersTypeName;
		}
		
		public String[] getGenericParametersTypeName() {
			return parametersGenericTypeName;
		}
		
		public String getConstructorThrowns() {
			return constructorThrowns;
		}
		
		@Override
		public String toString() {
			return constructorDeclaration + " " + constructorName + " " + constructorParameters + " {...} " + constructorThrowns;
		}
	}
	
	@Override
	public String toString() {
		String text = "";
		Reflector _Reflector = new Reflector(thisClass, filterFileds, parameterName);
		text = _Reflector.superClassesAndInterfaces.toString() + " {\n";
		for(Reflector.FieldToString _FieldToString : _Reflector.getFields()) {
			text = text.concat("    " + _FieldToString + "\n\n");
		}
		
		for(Reflector.MethodToString _MethodToString : _Reflector.getMethods()) {
			text = text.concat("    " + _MethodToString + "\n\n");
		}
		
		for(Reflector.ConstructorToString _ConstructorToString : _Reflector.getConstructors()) {
			text = text.concat("    " + _ConstructorToString + "\n\n");
		}
		text = text.concat("}");
		return text;
	}
	
	private Reflector(Class<?> _Class, boolean filter, String customParameterName) {
		thisClass = _Class;
		filterFileds = filter;
		parameterName = customParameterName;
		List<MethodToString> methods = new ArrayList<>();
		List<ConstructorToString> constructors = new ArrayList<>();
		List<FieldToString> fields = new ArrayList<>();
		
		superClassesAndInterfaces = new ClassToString(_Class);
		
		for(Field _Field : _Class.getDeclaredFields()) {
			FieldToString element = new FieldToString(_Field);
			if(element.isPublic()) {fields.add(element);} else {if(element.isProtected()) {fields.add(element);} else {if(filter) {} else {fields.add(element);}}}
		}
		
		for(Method _Method : _Class.getDeclaredMethods()) {
			MethodToString element = new MethodToString(_Method, customParameterName);
		    
			if(element.isPublic()) {methods.add(element);} else {if(element.isProtected()) {methods.add(element);} else {if(filter) {} else {methods.add(element);}}}
		}
		
		for(Constructor<?> _Constructor : _Class.getDeclaredConstructors()) {
			ConstructorToString element = new ConstructorToString(_Constructor, customParameterName);
			if(element.isPublic()) {constructors.add(element);} else {if(element.isProtected()) {constructors.add(element);} else {if(filter) {} else {constructors.add(element);}}}
		}
		
		fieldsToString = new FieldToString[fields.size()];
		for(int i = 0; i < fields.size(); i++) {
			fieldsToString[i] = fields.get(i);
		}
		
		methodsToString = new MethodToString[methods.size()];
		for(int i = 0; i < methods.size(); i++) {
			methodsToString[i] = methods.get(i);
		}
		
		constructorsToString = new ConstructorToString[constructors.size()];
		for(int i = 0; i < constructors.size(); i++) {
			constructorsToString[i] = constructors.get(i);
		}
	}
}