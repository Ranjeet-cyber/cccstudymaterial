package com.examplejayho.cccstudymaterials.Biology;

public class BiologyQuestion8 {
    public String[][] mChoices = {new String[]{"Master pages", "Layouts", "Custom view", "Custom animation"}, new String[]{"Ctrl + X", "Ctrl + N", "Ctrl + M", "None of These"}, new String[]{"Beginning of presentation", "When move from one slide to next", "When we click inside the object of a slide", "At the end of the presentation"}, new String[]{"Space bar", "End key", "Break key", "Esc key"}, new String[]{"Empty presentation", "Form template", "Open new presentation", "Open existing presentation"}, new String[]{"Insert", "slide", "Tools", "None of These"}, new String[]{"Home tab", "Slide Show", "Design", "All of the above"}, new String[]{"Rehearsal", "Custom slide show", "Slide show setup", "Slide show view"}, new String[]{"Draw", "Impress", "Calc", "Writer"}, new String[]{"Custom Animation", "Rehearse Timing", "Slide Transition", "All of the above"}};
    public String[] mCorrectAnswer = {"Layouts", "Ctrl + M", "When move from one slide to next", "Esc key", "Empty presentation", "Tools", "Slide Show", "Slide show setup", "Impress", "Custom Animation"};
    public String[] mQuestion = {"Which of the following is not a section of tasks pane of Libre Impress?", "Which shortcut key is used for adding new slides to the presentation of LibreOffice Impress.", "Slide transitions are effects which perform", "Which shortcut key is used to exit from running presentation in Libre Impress", "Which of the following option is not available on Presentation Wizard?", "In which menu the Macros command is found in LibreOffice Impress?", "What would you choose to do Show PreView in PowerPoint?", "Which of the following features is used to create a new slide show with the current slides but presented in a different order?", "What is the name of powerpoint in libreoffice?", "Which of the following features is used to run the slide show automatically while speaking on the topic?"};

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
