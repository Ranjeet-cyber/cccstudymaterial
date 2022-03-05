package com.examplejayho.cccstudymaterials.Biology;

public class BiologyQuestion10 {
    public String[][] mChoices = {new String[]{"Title Only", "Title, Content", "Title, 4 Content", "All of these"}, new String[]{"jpeg", "wmv", "mpeg", "All of above"}, new String[]{"Handouts", "Print Preview", "Slide Shorter", "None of these"}, new String[]{"Insert", "slide", "Tools", "None"}, new String[]{"Custom Animation", "Rehearse Timing", "Slide Transition", "None"}, new String[]{"Normal view", "Outline view", "Notes", "Slide Sorter view"}, new String[]{"Slides pane", "Workspace", "Work pane", "Task pane"}, new String[]{"Space bar", "End key", "Break key", "Esc key"}, new String[]{"Pageup", "Pagedown", "Home", "End"}, new String[]{"Placeholders", "Object holders", "Auto layouts", "Text holders"}};
    public String[] mCorrectAnswer = {"All of these", "All of above", "Slide Shorter", "Tools", "Custom Animation", "Slide Sorter view", "Workspace", "Esc key", "Home", "Placeholders"};
    public String[] mQuestion = {"In Impress the Layout of a slide can be?", "Which of the following file formats can be added to LibreOffice Impress?", "Using which option do all slides appear simultaneously?", "In which menu is the Macros command found in LibreOffice Impress?", "Which of the following features is used to progress the slide show automatically while speaking on the topic?", "Which view is generally used for creating, formatting and designing slides?", "Which of the following is not a part of main impress window?", "The slide show can be exited at any time during the show by pressing which of the following keys?", "Which shortcut key is used to jump at the first slide?", "Objects on the slide that hold text are called?"};

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
