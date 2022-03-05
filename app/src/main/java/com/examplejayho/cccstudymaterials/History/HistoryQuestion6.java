package com.examplejayho.cccstudymaterials.History;

public class HistoryQuestion6 {
    public String[][] mChoices = {new String[]{"Magazines journals", "Invitation cards", "Applications", "All of the above"}, new String[]{"Calibri", "Times new roman", "Susha", "Ariel"}, new String[]{"Formatting", "Typing", "Mail merge", "Table"}, new String[]{"Google Docs", "Google Sheets", "Microsoft Excel", "Microsoft PowerPoint"}, new String[]{"Page number", "Date", "Title", "All of these"}, new String[]{"Ctrl+F12ं", "Shift+F12", "F12", "None of the above"}, new String[]{"Bulleted List > Format > Lists", "Format > Bulleted List > Lists", "Format > Lists > Bulleted List", "Lists>Format>Bulleted List"}, new String[]{"F5", "F6", "F7", "F8"}, new String[]{"Tools>Spelling", "Tools>Automatic Spell Checking", "Tools>Language", "Tools>Options"}, new String[]{"Copy", "Align Left", "Find & Replace", "Paste"}};
    public String[] mCorrectAnswer = {"All of the above", "Susha", "Mail merge", "Google Docs", "All of these", "F12", "Format > Lists > Bulleted List", "F7", "Tools>Spelling", "Find & Replace"};
    public String[] mQuestion = {"What can be created by LibreOffice Writer?", "The font used for Hindi typing is", "What is the method of sending information and data together to many people?", "Which of the following is an example of online Writer software?", "Which of the given options can you add to a header?", "Which shortcut key is used in a LibreOffice Writer document to create a numbered list?", "What is the correct sequence of steps required to create a bulleted list in LibreOffice Writer?", "Which shortcut key will you use to start the Spell Checker?", "Which menu option will you use to start the spell checker in LibreOffice Writer?", "Rohit wants to change the spelling of a word in the entire document. Which option will she use?"};

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
