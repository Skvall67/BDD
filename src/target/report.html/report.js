$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("test.feature");
formatter.feature({
  "line": 1,
  "name": "First Test Feature",
  "description": "",
  "id": "first-test-feature",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 4,
  "name": "Test 1",
  "description": "",
  "id": "first-test-feature;test-1",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 3,
      "name": "@YandexMarketTest"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "открывает сайт \"https://market.yandex.ru/\"",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "находится на странице \"Страница поиска Яндекс Маркет\"",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "пользователь (заполняет поле) \"Окно поиска\" \"фыфы\"",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "Проверяет окно ввода \"строку поиска\"",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "Проверяет окно ввода \"первую строку поиска\"",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "https://market.yandex.ru/",
      "offset": 16
    }
  ],
  "location": "CommonStepDefinitions.openSite(String)"
});
formatter.result({
  "duration": 7569238050,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Страница поиска Яндекс Маркет",
      "offset": 23
    }
  ],
  "location": "CommonStepDefinitions.userIsOnPage(String)"
});
formatter.result({
  "duration": 294786496,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "заполняет поле",
      "offset": 14
    },
    {
      "val": "Окно поиска",
      "offset": 31
    },
    {
      "val": "фыфы",
      "offset": 45
    }
  ],
  "location": "CommonStepDefinitions.actionTwoParam(String,String,String)"
});
formatter.result({
  "duration": 59033617,
  "error_message": "java.lang.reflect.InvocationTargetException\n\tat sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)\n\tat sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)\n\tat sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)\n\tat java.lang.reflect.Method.invoke(Method.java:498)\n\tat StepsDefinition.CommonStepDefinitions.actionTwoParam(CommonStepDefinitions.java:90)\n\tat ✽.When пользователь (заполняет поле) \"Окно поиска\" \"фыфы\"(test.feature:7)\nCaused by: java.lang.ClassNotFoundException: PageObjectsPackage.*\n\tat java.net.URLClassLoader.findClass(URLClassLoader.java:381)\n\tat java.lang.ClassLoader.loadClass(ClassLoader.java:424)\n\tat sun.misc.Launcher$AppClassLoader.loadClass(Launcher.java:335)\n\tat java.lang.ClassLoader.loadClass(ClassLoader.java:357)\n\tat java.lang.Class.forName0(Native Method)\n\tat java.lang.Class.forName(Class.java:264)\n\tat PageObjectsPackage.MainPage.findElementByTitle(MainPage.java:32)\n\tat PageObjectsPackage.MainPage.fillsField(MainPage.java:25)\n\tat sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)\n\tat sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)\n\tat sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)\n\tat java.lang.reflect.Method.invoke(Method.java:498)\n\tat StepsDefinition.CommonStepDefinitions.actionTwoParam(CommonStepDefinitions.java:90)\n\tat sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)\n\tat sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)\n\tat sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)\n\tat java.lang.reflect.Method.invoke(Method.java:498)\n\tat cucumber.runtime.Utils$1.call(Utils.java:40)\n\tat cucumber.runtime.Timeout.timeout(Timeout.java:16)\n\tat cucumber.runtime.Utils.invoke(Utils.java:34)\n\tat cucumber.runtime.java.JavaStepDefinition.execute(JavaStepDefinition.java:38)\n\tat cucumber.runtime.StepDefinitionMatch.runStep(StepDefinitionMatch.java:37)\n\tat cucumber.runtime.Runtime.runStep(Runtime.java:300)\n\tat cucumber.runtime.model.StepContainer.runStep(StepContainer.java:44)\n\tat cucumber.runtime.model.StepContainer.runSteps(StepContainer.java:39)\n\tat cucumber.runtime.model.CucumberScenario.run(CucumberScenario.java:44)\n\tat cucumber.runtime.junit.ExecutionUnitRunner.run(ExecutionUnitRunner.java:102)\n\tat cucumber.runtime.junit.FeatureRunner.runChild(FeatureRunner.java:63)\n\tat cucumber.runtime.junit.FeatureRunner.runChild(FeatureRunner.java:18)\n\tat org.junit.runners.ParentRunner$3.run(ParentRunner.java:290)\n\tat org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:71)\n\tat org.junit.runners.ParentRunner.runChildren(ParentRunner.java:288)\n\tat org.junit.runners.ParentRunner.access$000(ParentRunner.java:58)\n\tat org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:268)\n\tat org.junit.runners.ParentRunner.run(ParentRunner.java:363)\n\tat cucumber.runtime.junit.FeatureRunner.run(FeatureRunner.java:70)\n\tat cucumber.api.junit.Cucumber.runChild(Cucumber.java:95)\n\tat cucumber.api.junit.Cucumber.runChild(Cucumber.java:38)\n\tat org.junit.runners.ParentRunner$3.run(ParentRunner.java:290)\n\tat org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:71)\n\tat org.junit.runners.ParentRunner.runChildren(ParentRunner.java:288)\n\tat org.junit.runners.ParentRunner.access$000(ParentRunner.java:58)\n\tat org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:268)\n\tat org.junit.runners.ParentRunner.run(ParentRunner.java:363)\n\tat cucumber.api.junit.Cucumber.run(Cucumber.java:100)\n\tat org.junit.runner.JUnitCore.run(JUnitCore.java:137)\n\tat com.intellij.junit4.JUnit4IdeaTestRunner.startRunnerWithArgs(JUnit4IdeaTestRunner.java:68)\n\tat com.intellij.rt.execution.junit.IdeaTestRunner$Repeater.startRunnerWithArgs(IdeaTestRunner.java:51)\n\tat com.intellij.rt.execution.junit.JUnitStarter.prepareStreamsAndStart(JUnitStarter.java:242)\n\tat com.intellij.rt.execution.junit.JUnitStarter.main(JUnitStarter.java:70)\n",
  "status": "failed"
});
formatter.match({
  "arguments": [
    {
      "val": "строку поиска",
      "offset": 22
    }
  ],
  "location": "CommonStepDefinitions.checksInputWindow(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "первую строку поиска",
      "offset": 22
    }
  ],
  "location": "CommonStepDefinitions.checksInputWindow(String)"
});
formatter.result({
  "status": "skipped"
});
});