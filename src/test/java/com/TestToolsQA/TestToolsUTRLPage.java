package com.TestToolsQA;

import java.io.IOException;
import org.testng.annotations.Test;
import com.ToolsQA.Browserinit;

public class TestToolsUTRLPage extends Browserinit {
	
	@Test
	public static void TestMainPage() throws IOException {
		
		Browserinit tmp = new Browserinit();
		tmp.browserlaunch();
	}
	

}
