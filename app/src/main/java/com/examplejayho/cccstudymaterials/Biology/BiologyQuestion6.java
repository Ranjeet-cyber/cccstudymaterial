package com.examplejayho.cccstudymaterials.Biology;

public class BiologyQuestion6 {
    public String[][] mChoices = {new String[]{"Graphics, templates, spell checker, thesaurus", "Password protection, restricted areas, version control", "Accessibility, multimedia, hyperlinks, updated", "Animation effects, slide notes, transitions"}, new String[]{"5%", "15%", "10%", "20%"}, new String[]{"Placeholders", "Object holders", "Auto layouts", "Text holders"}, new String[]{"Portrait", "Landscape", "Horizontal", "Vertical"}, new String[]{"JPEG", "HTML", "GIF", "WAV"}, new String[]{"Ctrl + N", "Ctrl+ M", "Alt + N", "Alt + M"}, new String[]{"Slides", "Pages", "Papers", "Handouts"}, new String[]{"F5", "Shift + F5", "Ctrl + F5", "F4"}, new String[]{"Slide show", "Slide", "Format", "Tools"}, new String[]{"Pageup", "Pagedown", "Ctrl + Down Arrow", "End Key"}};
    public String[] mCorrectAnswer = {"Animation effects, slide notes, transitions", "20%", "Placeholders", "Landscape", "HTML", "Ctrl+ M", "Slides", "F5", "Slide", "Pagedown"};
    public String[] mQuestion = {"Which of the following are features of presentation software?", "What is the minimum zoom in LibreOffice Impress?", "Objects on the slide that hold text are called?", "What is default orientation of slide in LibreOffice Impress?", "Which file format is can not be added in LibreOffice Impress?", "Which shortcut key is used to insert a new slide in a presentation?", "The presentation is seen on the computer or a projection screen in the form of", "What is the shortcut key for PPT slide show?", "In which menu is the master slide function found in Libre Office Impress?", "Which shortcut key is used to move next slide in LibreOffice Impress?"};

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
