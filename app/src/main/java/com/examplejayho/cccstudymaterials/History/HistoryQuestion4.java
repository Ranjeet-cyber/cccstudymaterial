package com.examplejayho.cccstudymaterials.History;

public class HistoryQuestion4 {
    public String[][] mChoices = {new String[]{"हेडर", "फुटर", "बुकमार्क", "उपरोक्त सभी"}, new String[]{"View", "Page Layout", "Edit", "Insert"}, new String[]{"3", "4", "5", "6"}, new String[]{"Tools", "View", "Page Layout", "Insert"}, new String[]{"Page Orientation", "Paper Size", "Page Layout", "Page Margin"}, new String[]{"Ctrl+R", "Ctrl+Shift+R", "Alt+Shift+C", "Window+L+R"}, new String[]{"F1", "F2", "F7", "F9"}, new String[]{"Tools", "Insert", "Format", "Edit"}, new String[]{"Save As dialog box", "Spelling & Grammar dialog box", "Chart Wizard", "Font dialog box"}, new String[]{"Re-Open the last closed document", "Insert Hyperlink", "Insert Hyperlink", "Center align the selected Paragraph"}};
    public String[] mCorrectAnswer = {"फुटर", "Edit", "3", "Insert", "Page Orientation", "Ctrl+Shift+R", "F7", "Tools", "Save As dialog box", "Center align the selected Paragraph"};
    public String[] mQuestion = {"जो टेक्स्ट हर पेज के बॉटम में प्रिंट होता होता हैं।", "LibreOffice में Find & Replace का ऑप्शन किस Menu मे होता है?", "MS Word में किसी Document को Save करने के कितने तरीके है?", "Writer में फुटनोट और End नोट का ऑप्शन किस Menu में होता है?", "Portrait और Landscape क्या है?", "Libreoffice मे Ruler की शार्टकट है?", "Microsoft word में Spelling Check करने की short Cut Key क्या है?", "Libre Office में वर्ड काउंट आप्शन किस मेनू में होता है|", "F12 Key का उपयोग किस लिए किया जाता है?", "Ctrl+E का उपयोग किस लिए किया जाता है?"};

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
