package com.examplejayho.cccstudymaterials.World;

public class WorldQuestion7 {
    public String[][] mChoices = {new String[]{"2", "4", "8", "10"}, new String[]{"First generation", "Second generation", "Third generation", "Fourth generation"}, new String[]{"Semiconductor memory", "Memory register", "Magnetic memory", "None of above"}, new String[]{"Resembles digital computer", "Resembles analogue computer", "Resembles both a digital and analogue computer", "None of the above"}, new String[]{"Minicomputers", "Microcomputers", "Mainframe computers", "Super computer"}, new String[]{"Primary memory", "Control section", "External memory", "Cache memory"}, new String[]{"Transistors", "Vacuum Tubes and Valves", "Integrated Circuits", "None of above"}, new String[]{"RGB monitor", "Plotter", "Ink-jet printer", "Laser printer"}, new String[]{"Feasibility study, system design and testing", "Implementation and documentation", "Lexical Analysis, syntax analysis, and code generation", "None of the above"}, new String[]{"SSI", "MSI", "LSI", "Both a and b"}};
    public String[] mCorrectAnswer = {"4", "Third generation", "None of above", "Resembles both a digital and analogue computer", "Mainframe computers", "Control section", "Vacuum Tubes and Valves", "Plotter", "Lexical Analysis, syntax analysis, and code generation", "Both a and b"};
    public String[] mQuestion = {"A Nibble consists of ________ bit.", "Integrated Circuits (ICs) are related to which generation of computers?", "CD-ROM is a", "A hybrid computer", "Which type of computers uses the 8-bit code called EBCDIC?", "The ALU of a computer responds to the commands coming from", "Main component of first-generation computer was", "To produce high quality graphics (hardcopy) in colour, you would want to use a/n", "What are the stages in the compilation process?", "Which of the following IC was used in third generation of computers?"};

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
