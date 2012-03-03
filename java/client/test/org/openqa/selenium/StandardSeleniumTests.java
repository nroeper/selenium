/*
Copyright 2012 WebDriver committers
Copyright 2012 Software Freedom Conservancy

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

     http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
*/

package org.openqa.selenium;

import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.openqa.selenium.environment.GlobalTestEnvironment;
import org.openqa.selenium.environment.InProcessTestEnvironment;

@RunWith(Suite.class)
@Suite.SuiteClasses({
    AlertsTest.class,
    DragAndDropTest.class,
    ElementAttributeTest.class,
    ElementEqualityTest.class,
    ElementFindingTest.class,
    ElementSelectingTest.class,
    ErrorsTest.class,
    ExecutingAsyncJavascriptTest.class,
    ExecutingJavascriptTest.class,
    FormHandlingTest.class,
    FrameSwitchingTest.class,
    GetMultipleAttributeTest.class,
    I18nTest.class,
    ImplicitWaitTest.class,
    JavascriptEnabledDriverTest.class,
    MiscTest.class,
    ObjectStateAssumptionsTest.class,
    OpacityTest.class,
    PageLoadingTest.class,
    PartialLinkTextMatchTest.class,
    RenderedWebElementTest.class,
    RotatableTest.class,
    SelectElementHandlingTest.class,
    SlowLoadingPageTest.class,
    StaleElementReferenceTest.class,
    SvgElementTest.class,
    TagNameTest.class,
    TakesScreenshotTest.class,
    TextHandlingTest.class,
    TextPagesTest.class,
    TypingTest.class,
    UploadTest.class,
    VisibilityTest.class,
    WebElementTest.class,
    WindowSwitchingTest.class,
    WindowTest.class,
    XPathElementFindingTest.class
})
public class StandardSeleniumTests {

  @BeforeClass
  public static void prepareCommonEnvironment() {
    GlobalTestEnvironment.get(InProcessTestEnvironment.class);
  }
}