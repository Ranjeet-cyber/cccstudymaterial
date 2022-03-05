package com.examplejayho.cccstudymaterials.Chemistry;

public class ChemistryQuestion5 {
    public String[][] mChoices = {new String[]{"टाइटल बार", "मैन्यु बार", "फार्मूला बार", "स्टैंडर्ड टूल बार"}, new String[]{"121", "120", "130", "122"}, new String[]{"Data", "Sheet", "Windows", "Edit"}, new String[]{"=SUM(B1+B10)", "=SUM(B1:10)", "=ADD(B1+B10)", "=ADD(B1:B10)"}, new String[]{"=SUM(A1+B5+D4)", "=SUM(B1:B5:D4)", "=ADD(B1+B5+D4)", "=ADD(B1:B5:D4)"}, new String[]{"Ctrl+Shift+J", "Ctrl+Shift+F11", "F11", "Not"}, new String[]{"Ctrl+F2", "Shift+F3", "Ctrl+Alt+C", "None Of These"}, new String[]{"A16384", "IBI", "A1", "B1"}, new String[]{"AVG", "MAX", "COS", "All of the above"}, new String[]{"100", "163", "200", "1.65"}};
    public String[] mCorrectAnswer = {"फार्मूला बार", "121", "Sheet", "=SUM(B1:10)", "=SUM(A1+B5+D4)", "Ctrl+Shift+J", "Ctrl+Alt+C", "A1", "COS", "200"};
    public String[] mQuestion = {"CALC विंडो कौन सा क्षेत्र VALUE ,सूत्र को इंटर करता है ?", "Libreoffice Calc मे =CEILING(120;11) का मान कितना होगा?", "LibreOffice calc में किस मेनू में से Sheet का नाम बदल सकते सकते है?", "B1 से लेकर B10 तक जोड़ने का फार्मूला है?", "A1, B5 और D4 को जोड़ने का सही फार्मूला है?", "Libreoffice calc में full screen mode की शॉर्टकट की है ?", "Libreoffice calc मे comment insert की शॉटकट की है ?", "किसी वर्कशीट के प्रथम सेल का सेल एड्रेस होगा।", "Mathematical Functions का एक उदाहरण हैं।", "=Round (165, -2) का मान है?"};

    public String getQuestion(int i) {
        return this.mQuestion[i];
    }

    public String getChoice1(int i) {
        return this.mChoices[i][0];
    }

    public String getChoice2(int i) {
        return this.mChoices[i][1];
    }

    public String getChoice3(int i) {
        return this.mChoices[i][2];
    }

    public String getChoice4(int i) {
        return this.mChoices[i][3];
    }

    public String getCorrectAnswer(int i) {
        return this.mCorrectAnswer[i];
    }
}
