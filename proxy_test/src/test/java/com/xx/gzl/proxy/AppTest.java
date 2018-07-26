package com.xx.gzl.proxy;

import com.xx.gzl.proxy.dynamic.LesionCompany;
import com.xx.gzl.proxy.stat.AaCompany;
import com.xx.gzl.proxy.stat.BbCompany;
import com.xx.gzl.proxy.stat.Lesion;
import com.xx.gzl.proxy.stat.ManToolsCompany;
import com.xx.gzl.proxy.stat.WoManToolsCompany;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class AppTest 
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public AppTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( AppTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp()
    {
//    	ManToolsCompany comm = new AaCompany();
//    	Lesion lesion = new Lesion();
//    	lesion.setComm(comm);
//    	lesion.buyTools("18");
    	
    	ManToolsCompany comm = new AaCompany();
    	WoManToolsCompany woComm = new BbCompany();
    	
    	LesionCompany lesionCompany = new LesionCompany();
    	lesionCompany.setComm(comm);
    	ManToolsCompany proxyInstance = (ManToolsCompany) lesionCompany.getProxyInstance();
    	proxyInstance.buyTools("Man");
    	
    	lesionCompany.setComm(woComm);
    	WoManToolsCompany proxyInstance2 = (WoManToolsCompany) lesionCompany.getProxyInstance();
    	proxyInstance2.sealModel("Woman");
    }
    
    
}
