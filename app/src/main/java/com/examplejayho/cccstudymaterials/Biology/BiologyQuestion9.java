package com.examplejayho.cccstudymaterials.Biology;

public class BiologyQuestion9 {
    public String[][] mChoices = {new String[]{"Odt", "ods", "Odp", "Odi"}, new String[]{"Picture, Not Movie", "Movie but not Picture", "Both Movie and Picture", "None of the Above"}, new String[]{"Normal view", "Outline view", "Notes", "Slide Sorter view"}, new String[]{"Slides pane", "Workspace", "Work pane", "Task pane"}, new String[]{"left on the page", "centre of the page", "top of the page", "bottom of the page"}, new String[]{"Flash once", "Typewriter", "Fly from top", "All the above"}, new String[]{"Wipe allover", "Dissolve", "Bit by bit", "None of these"}, new String[]{"Ctrl + Q", "Ctrl + W", "Shift + C", "None of these"}, new String[]{"F2", "F3", "F4", "F5"}, new String[]{"Drawing Toolbar", "Standard Toolbar", "Presentation", "All of these"}};
    public String[] mCorrectAnswer = {"Odp", "Both Movie and Picture", "Slide Sorter view", "Workspace", "bottom of the page", "All the above", "Dissolve", "None of these", "F2", "Standard Toolbar"};
    public String[] mQuestion = {"What is the extension of libreOffice impress?", "Which Objects can be added into the presentation?", "Which view is generally used for creating, formatting and designing slides?", "Which of the following is not a part of main impress window?", "In slider master footer area appears at", "Following is a type of Slide animation", "The following is a slide transition effect", "Which shortcut key is used to exit from presentation in LibreOffice Impress?", "In LibreOffice Impress the shortcut key to insert a text box.", "Export Direct as PDF option available at?"};

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
