/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.opens.tanaguru.rule.accessiweb20;

import java.util.ArrayList;
import java.util.List;
import org.opens.tanaguru.entity.audit.TestSolution;
import org.opens.tanaguru.rule.test.AbstractRuleImplementationTestCase;

/**
 *
 * @author jkowalczyk
 */
public class Aw20Rule10041Test extends AbstractRuleImplementationTestCase {

    public Aw20Rule10041Test(String testName) {
        super(testName);
    }

    @Override
    protected void setUpRuleImplementationClassName() {
        ruleImplementationClassName = "org.opens.tanaguru.rule.accessiweb20.Aw20Rule10041";
    }

    @Override
    protected void setUpWebResourceMap() {
        webResourceMap.put("AW20.Test.10.04.01-4NA-01",
                webResourceFactory.createPage(
                testcasesFilePath + "AW22/AW20.Test.10.04.01-4NA-01.html"));
        
        webResourceMap.put("AW20.Test.10.04.01-1Passed-01",
                webResourceFactory.createPage(
                testcasesFilePath + "AW22/AW20.Test.10.04.01-1Passed-01.html"));
        webResourceMap.put("AW20.Test.10.04.01-1Passed-02",
                webResourceFactory.createPage(
                testcasesFilePath + "AW22/AW20.Test.10.04.01-1Passed-02.html"));

        webResourceMap.put("AW20.Test.10.04.01-2Failed-01_1",
                webResourceFactory.createPage(
                testcasesFilePath + "AW22/AW20.Test.10.04.01-2Failed-01_1.html"));
        webResourceMap.put("AW20.Test.10.04.01-2Failed-01_2",
                webResourceFactory.createPage(
                testcasesFilePath + "AW22/AW20.Test.10.04.01-2Failed-01_2.html"));
        webResourceMap.put("AW20.Test.10.04.01-2Failed-01_3",
                webResourceFactory.createPage(
                testcasesFilePath + "AW22/AW20.Test.10.04.01-2Failed-01_3.html"));
        webResourceMap.put("AW20.Test.10.04.01-2Failed-01_4",
                webResourceFactory.createPage(
                testcasesFilePath + "AW22/AW20.Test.10.04.01-2Failed-01_4.html"));
        webResourceMap.put("AW20.Test.10.04.01-2Failed-01_5",
                webResourceFactory.createPage(
                testcasesFilePath + "AW22/AW20.Test.10.04.01-2Failed-01_5.html"));

        webResourceMap.put("AW20.Test.10.04.01-2Failed-02_1",
                webResourceFactory.createPage(
                testcasesFilePath + "AW22/AW20.Test.10.04.01-2Failed-02_1.html"));
        webResourceMap.put("AW20.Test.10.04.01-2Failed-02_2",
                webResourceFactory.createPage(
                testcasesFilePath + "AW22/AW20.Test.10.04.01-2Failed-02_2.html"));
        webResourceMap.put("AW20.Test.10.04.01-2Failed-02_3",
                webResourceFactory.createPage(
                testcasesFilePath + "AW22/AW20.Test.10.04.01-2Failed-02_3.html"));
        webResourceMap.put("AW20.Test.10.04.01-2Failed-02_4",
                webResourceFactory.createPage(
                testcasesFilePath + "AW22/AW20.Test.10.04.01-2Failed-02_4.html"));
        webResourceMap.put("AW20.Test.10.04.01-2Failed-02_5",
                webResourceFactory.createPage(
                testcasesFilePath + "AW22/AW20.Test.10.04.01-2Failed-02_5.html"));

        webResourceMap.put("AW20.Test.10.04.01-2Failed-03_1",
                webResourceFactory.createPage(
                testcasesFilePath + "AW22/AW20.Test.10.04.01-2Failed-03_1.html"));
        webResourceMap.put("AW20.Test.10.04.01-2Failed-03_2",
                webResourceFactory.createPage(
                testcasesFilePath + "AW22/AW20.Test.10.04.01-2Failed-03_2.html"));
        webResourceMap.put("AW20.Test.10.04.01-2Failed-03_3",
                webResourceFactory.createPage(
                testcasesFilePath + "AW22/AW20.Test.10.04.01-2Failed-03_3.html"));
        webResourceMap.put("AW20.Test.10.04.01-2Failed-03_4",
                webResourceFactory.createPage(
                testcasesFilePath + "AW22/AW20.Test.10.04.01-2Failed-03_4.html"));
        webResourceMap.put("AW20.Test.10.04.01-2Failed-03_5",
                webResourceFactory.createPage(
                testcasesFilePath + "AW22/AW20.Test.10.04.01-2Failed-03_5.html"));

        webResourceMap.put("AW20.Test.10.04.01-2Failed-04_1",
                webResourceFactory.createPage(
                testcasesFilePath + "AW22/AW20.Test.10.04.01-2Failed-04_1.html"));
        webResourceMap.put("AW20.Test.10.04.01-2Failed-04_2",
                webResourceFactory.createPage(
                testcasesFilePath + "AW22/AW20.Test.10.04.01-2Failed-04_2.html"));
        webResourceMap.put("AW20.Test.10.04.01-2Failed-04_3",
                webResourceFactory.createPage(
                testcasesFilePath + "AW22/AW20.Test.10.04.01-2Failed-04_3.html"));
        webResourceMap.put("AW20.Test.10.04.01-2Failed-04_4",
                webResourceFactory.createPage(
                testcasesFilePath + "AW22/AW20.Test.10.04.01-2Failed-04_4.html"));
        webResourceMap.put("AW20.Test.10.04.01-2Failed-04_5",
                webResourceFactory.createPage(
                testcasesFilePath + "AW22/AW20.Test.10.04.01-2Failed-04_5.html"));

        webResourceMap.put("AW20.Test.10.04.01-2Failed-05_1",
                webResourceFactory.createPage(
                testcasesFilePath + "AW22/AW20.Test.10.04.01-2Failed-05_1.html"));
        webResourceMap.put("AW20.Test.10.04.01-2Failed-05_2",
                webResourceFactory.createPage(
                testcasesFilePath + "AW22/AW20.Test.10.04.01-2Failed-05_2.html"));
        webResourceMap.put("AW20.Test.10.04.01-2Failed-05_3",
                webResourceFactory.createPage(
                testcasesFilePath + "AW22/AW20.Test.10.04.01-2Failed-05_3.html"));
        webResourceMap.put("AW20.Test.10.04.01-2Failed-05_4",
                webResourceFactory.createPage(
                testcasesFilePath + "AW22/AW20.Test.10.04.01-2Failed-05_4.html"));
        webResourceMap.put("AW20.Test.10.04.01-2Failed-05_5",
                webResourceFactory.createPage(
                testcasesFilePath + "AW22/AW20.Test.10.04.01-2Failed-05_5.html"));

        webResourceMap.put("AW20.Test.10.04.01-3NMI-01",
                webResourceFactory.createPage(
                testcasesFilePath + "AW22/AW20.Test.10.04.01-3NMI-01.html"));

        setUpRelatedContentMap();
    }

    private void setUpRelatedContentMap(){
        List<String> relatedContent1 = new ArrayList<String>();
        relatedContent1.add("css/AW20.Test.10.04.01-2Failed-01_1.css");
        relatedContentMap.put(webResourceMap.get("AW20.Test.10.04.01-2Failed-01_1"), relatedContent1);

        List<String> relatedContent2 = new ArrayList<String>();
        relatedContent2.add("css/AW20.Test.10.04.01-2Failed-01_2.css");
        relatedContent2.add("css/AW20.Test.10.04.01-2Failed-01_2_1.css");
        relatedContentMap.put(webResourceMap.get("AW20.Test.10.04.01-2Failed-01_2"), relatedContent2);

        List<String> relatedContent3 = new ArrayList<String>();
        relatedContent3.add("css/AW20.Test.10.04.01-2Failed-01_3.css");
        relatedContentMap.put(webResourceMap.get("AW20.Test.10.04.01-2Failed-01_3"), relatedContent3);
    }

    @Override
    protected void setProcess() {
        assertEquals(TestSolution.FAILED,
                processPageTest("AW20.Test.10.04.01-2Failed-01_1").getValue());
        assertEquals(TestSolution.FAILED,
                processPageTest("AW20.Test.10.04.01-2Failed-01_2").getValue());
        assertEquals(TestSolution.FAILED,
                processPageTest("AW20.Test.10.04.01-2Failed-01_3").getValue());
        assertEquals(TestSolution.FAILED,
                processPageTest("AW20.Test.10.04.01-2Failed-01_4").getValue());
        assertEquals(TestSolution.FAILED,
                processPageTest("AW20.Test.10.04.01-2Failed-01_5").getValue());

        assertEquals(TestSolution.FAILED,
                processPageTest("AW20.Test.10.04.01-2Failed-02_1").getValue());
        assertEquals(TestSolution.FAILED,
                processPageTest("AW20.Test.10.04.01-2Failed-02_2").getValue());
        assertEquals(TestSolution.FAILED,
                processPageTest("AW20.Test.10.04.01-2Failed-02_3").getValue());
        assertEquals(TestSolution.FAILED,
                processPageTest("AW20.Test.10.04.01-2Failed-02_4").getValue());
        assertEquals(TestSolution.FAILED,
                processPageTest("AW20.Test.10.04.01-2Failed-02_5").getValue());

        assertEquals(TestSolution.FAILED,
                processPageTest("AW20.Test.10.04.01-2Failed-03_1").getValue());
        assertEquals(TestSolution.FAILED,
                processPageTest("AW20.Test.10.04.01-2Failed-03_2").getValue());
        assertEquals(TestSolution.FAILED,
                processPageTest("AW20.Test.10.04.01-2Failed-03_3").getValue());
        assertEquals(TestSolution.FAILED,
                processPageTest("AW20.Test.10.04.01-2Failed-03_4").getValue());
        assertEquals(TestSolution.FAILED,
                processPageTest("AW20.Test.10.04.01-2Failed-03_5").getValue());

        assertEquals(TestSolution.FAILED,
                processPageTest("AW20.Test.10.04.01-2Failed-04_1").getValue());
        assertEquals(TestSolution.FAILED,
                processPageTest("AW20.Test.10.04.01-2Failed-04_2").getValue());
        assertEquals(TestSolution.FAILED,
                processPageTest("AW20.Test.10.04.01-2Failed-04_3").getValue());
        assertEquals(TestSolution.FAILED,
                processPageTest("AW20.Test.10.04.01-2Failed-04_4").getValue());
        assertEquals(TestSolution.FAILED,
                processPageTest("AW20.Test.10.04.01-2Failed-04_5").getValue());

        assertEquals(TestSolution.FAILED,
                processPageTest("AW20.Test.10.04.01-2Failed-05_1").getValue());
        assertEquals(TestSolution.FAILED,
                processPageTest("AW20.Test.10.04.01-2Failed-05_2").getValue());
        assertEquals(TestSolution.FAILED,
                processPageTest("AW20.Test.10.04.01-2Failed-05_3").getValue());
        assertEquals(TestSolution.FAILED,
                processPageTest("AW20.Test.10.04.01-2Failed-05_4").getValue());
        assertEquals(TestSolution.FAILED,
                processPageTest("AW20.Test.10.04.01-2Failed-05_5").getValue());
        
        
        assertEquals(TestSolution.PASSED,
                processPageTest("AW20.Test.10.04.01-1Passed-01").getValue());
        assertEquals(TestSolution.PASSED,
                processPageTest("AW20.Test.10.04.01-1Passed-02").getValue());

        assertEquals(TestSolution.NOT_APPLICABLE,
                processPageTest("AW20.Test.10.04.01-4NA-01").getValue());

        assertEquals(TestSolution.NEED_MORE_INFO,
                processPageTest("AW20.Test.10.04.01-3NMI-01").getValue());
    }

    @Override
    protected void setConsolidate() {
        assertEquals(TestSolution.FAILED,
                consolidate("AW20.Test.10.04.01-2Failed-01_1").getValue());
        assertEquals(TestSolution.FAILED,
                consolidate("AW20.Test.10.04.01-2Failed-01_2").getValue());
        assertEquals(TestSolution.FAILED,
                consolidate("AW20.Test.10.04.01-2Failed-01_3").getValue());
        assertEquals(TestSolution.FAILED,
                consolidate("AW20.Test.10.04.01-2Failed-01_4").getValue());
        assertEquals(TestSolution.FAILED,
                consolidate("AW20.Test.10.04.01-2Failed-01_5").getValue());

        assertEquals(TestSolution.FAILED,
                consolidate("AW20.Test.10.04.01-2Failed-02_1").getValue());
        assertEquals(TestSolution.FAILED,
                consolidate("AW20.Test.10.04.01-2Failed-02_2").getValue());
        assertEquals(TestSolution.FAILED,
                consolidate("AW20.Test.10.04.01-2Failed-02_3").getValue());
        assertEquals(TestSolution.FAILED,
                consolidate("AW20.Test.10.04.01-2Failed-02_4").getValue());
        assertEquals(TestSolution.FAILED,
                consolidate("AW20.Test.10.04.01-2Failed-02_5").getValue());

        assertEquals(TestSolution.FAILED,
                consolidate("AW20.Test.10.04.01-2Failed-03_1").getValue());
        assertEquals(TestSolution.FAILED,
                consolidate("AW20.Test.10.04.01-2Failed-03_2").getValue());
        assertEquals(TestSolution.FAILED,
                consolidate("AW20.Test.10.04.01-2Failed-03_3").getValue());
        assertEquals(TestSolution.FAILED,
                consolidate("AW20.Test.10.04.01-2Failed-03_4").getValue());
        assertEquals(TestSolution.FAILED,
                consolidate("AW20.Test.10.04.01-2Failed-03_5").getValue());

        assertEquals(TestSolution.FAILED,
                consolidate("AW20.Test.10.04.01-2Failed-04_1").getValue());
        assertEquals(TestSolution.FAILED,
                consolidate("AW20.Test.10.04.01-2Failed-04_2").getValue());
        assertEquals(TestSolution.FAILED,
                consolidate("AW20.Test.10.04.01-2Failed-04_3").getValue());
        assertEquals(TestSolution.FAILED,
                consolidate("AW20.Test.10.04.01-2Failed-04_4").getValue());
        assertEquals(TestSolution.FAILED,
                consolidate("AW20.Test.10.04.01-2Failed-04_5").getValue());

        assertEquals(TestSolution.FAILED,
                consolidate("AW20.Test.10.04.01-2Failed-05_1").getValue());
        assertEquals(TestSolution.FAILED,
                consolidate("AW20.Test.10.04.01-2Failed-05_2").getValue());
        assertEquals(TestSolution.FAILED,
                consolidate("AW20.Test.10.04.01-2Failed-05_3").getValue());
        assertEquals(TestSolution.FAILED,
                consolidate("AW20.Test.10.04.01-2Failed-05_4").getValue());
        assertEquals(TestSolution.FAILED,
                consolidate("AW20.Test.10.04.01-2Failed-05_5").getValue());

        

        assertEquals(TestSolution.PASSED,
                consolidate("AW20.Test.10.04.01-1Passed-01").getValue());
        assertEquals(TestSolution.PASSED,
                consolidate("AW20.Test.10.04.01-1Passed-02").getValue());

        assertEquals(TestSolution.NOT_APPLICABLE,
                consolidate("AW20.Test.10.04.01-4NA-01").getValue());

        assertEquals(TestSolution.NEED_MORE_INFO,
                consolidate("AW20.Test.10.04.01-3NMI-01").getValue());
    }

}
