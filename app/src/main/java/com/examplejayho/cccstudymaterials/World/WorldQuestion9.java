package com.examplejayho.cccstudymaterials.World;

public class WorldQuestion9 {
    public String[][] mChoices = {new String[]{"Dot matrix printer", "Digital plotter", "Line printer", "All of the above"}, new String[]{"OCR", "Optical scanners", "Voice recognition device", "COM (Computer Output to Microfilm)"}, new String[]{"16 digits", "6 digits", "9 digits", "All of above"}, new String[]{"Motherboard", "Daughterboard", "Bredboard", "Fatherboard"}, new String[]{"Volatile", "Non-volatile", "Volatile and non-volatile", "None of the above"}, new String[]{"Direct access", "Sequential access", "Both of above", "None of above"}, new String[]{"Pulse code modulation", "Pulse stretcher", "Query processing", "Queue management"}, new String[]{"It is an output device", "It is an input device", "It is a peripheral device", "It is hardware item"}, new String[]{"Doing quick mathematical calculations", "Input, storage, manipulation and outputting of data", "Electronic data processing", "Performing repetitive tasks accurately"}, new String[]{"1900", "1906", "1910", "1880"}};
    public String[] mCorrectAnswer = {"Digital plotter", "COM (Computer Output to Microfilm)", "6 digits", "Motherboard", "Volatile", "Both of above", "Pulse code modulation", "It is a peripheral device", "Input, storage, manipulation and outputting of data", "1906"};
    public String[] mQuestion = {"A high quality CAD system uses the following for printing drawing and graphs", "Which of the following is not an input device?", "The accuracy of the floating-point numbers representable in two 16-bit words of a computer is approximately", "In PCs, the CPU, the device drivers, memory, expansion slots and active components are mounted on a single board. What is the name of the board?", "Main memory is", "Magnetic disks are the most popular medium for", "A technique used by codes to convert an analog signal into a digital bit stream is known as", "Regarding a VDU, Which statement is more correct?", "A modern electronic computer is a machine that is meant for", "When was vacuum tube invented?"};

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
