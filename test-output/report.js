$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("C:/Users/admin/eclipse-workspace/RestAssuredDemo/src/test/java/FeatureFile/Mock1.feature");
formatter.feature({
  "name": "Validate the mock api",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Verify the responc",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "Enter the url",
  "keyword": "Given "
});
formatter.match({
  "location": "Mock_01.enter_the_fake_url()"
});
formatter.result({
  "error_message": "java.lang.SecurityException: class \"org.hamcrest.Matchers\"\u0027s signer information does not match signer information of other classes in the same package\r\n\tat java.base/java.lang.ClassLoader.checkCerts(ClassLoader.java:1151)\r\n\tat java.base/java.lang.ClassLoader.preDefineClass(ClassLoader.java:906)\r\n\tat java.base/java.lang.ClassLoader.defineClass(ClassLoader.java:1015)\r\n\tat java.base/java.security.SecureClassLoader.defineClass(SecureClassLoader.java:151)\r\n\tat java.base/jdk.internal.loader.BuiltinClassLoader.defineClass(BuiltinClassLoader.java:821)\r\n\tat java.base/jdk.internal.loader.BuiltinClassLoader.findClassOnClassPathOrNull(BuiltinClassLoader.java:719)\r\n\tat java.base/jdk.internal.loader.BuiltinClassLoader.loadClassOrNull(BuiltinClassLoader.java:642)\r\n\tat java.base/jdk.internal.loader.BuiltinClassLoader.loadClass(BuiltinClassLoader.java:600)\r\n\tat java.base/jdk.internal.loader.ClassLoaders$AppClassLoader.loadClass(ClassLoaders.java:178)\r\n\tat java.base/java.lang.ClassLoader.loadClass(ClassLoader.java:522)\r\n\tat io.restassured.internal.ResponseSpecificationImpl.statusCode(ResponseSpecificationImpl.groovy:134)\r\n\tat io.restassured.internal.ValidatableResponseOptionsImpl.statusCode(ValidatableResponseOptionsImpl.java:89)\r\n\tat io.restassured.internal.ValidatableResponseImpl.super$2$statusCode(ValidatableResponseImpl.groovy)\r\n\tat java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)\r\n\tat java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)\r\n\tat java.base/jdk.internal.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)\r\n\tat java.base/java.lang.reflect.Method.invoke(Method.java:564)\r\n\tat org.codehaus.groovy.reflection.CachedMethod.invoke(CachedMethod.java:107)\r\n\tat groovy.lang.MetaMethod.doMethodInvoke(MetaMethod.java:323)\r\n\tat groovy.lang.MetaClassImpl.invokeMethod(MetaClassImpl.java:1268)\r\n\tat org.codehaus.groovy.runtime.ScriptBytecodeAdapter.invokeMethodOnSuperN(ScriptBytecodeAdapter.java:144)\r\n\tat io.restassured.internal.ValidatableResponseImpl.statusCode(ValidatableResponseImpl.groovy:142)\r\n\tat io.restassured.internal.ValidatableResponseImpl.statusCode(ValidatableResponseImpl.groovy)\r\n\tat Step_Definition.Mock_01.enter_the_fake_url(Mock_01.java:20)\r\n\tat ✽.Enter the url(C:/Users/admin/eclipse-workspace/RestAssuredDemo/src/test/java/FeatureFile/Mock1.feature:3)\r\n",
  "status": "failed"
});
formatter.step({
  "name": "verify the status code",
  "keyword": "When "
});
formatter.match({
  "location": "Mock_01.verify_the_status_code()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "verify the responce",
  "keyword": "Then "
});
formatter.match({
  "location": "Mock_01.verify_the_responce()"
});
formatter.result({
  "status": "skipped"
});
});