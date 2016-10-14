package com.roarbotics.json;

import com.cedarsoftware.util.io.JsonReader;

public class TemplateReader {
	public static void inputJSON(){
		ScoutingFormTemplate scoutTEMPLATE = (ScoutingFormTemplate) JsonReader.jsonToJava("template.json");
		System.out.println(scoutTEMPLATE.toString());
	}
}
