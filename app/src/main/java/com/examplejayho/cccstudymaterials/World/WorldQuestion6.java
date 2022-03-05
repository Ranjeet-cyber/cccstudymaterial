package com.examplejayho.cccstudymaterials.World;

public class WorldQuestion6 {
    public String[][] mChoices = {new String[]{"Universal Automatic Computer", "Universal Array Computer", "Unique Automatic Computer", "Unvalued Automatic Computer"}, new String[]{"Arithmetic operation", "Logical operation", "Storage and relative", "All the above"}, new String[]{"External memory chip", "Primary memory chip", "Microprocessor chip", "Both b and c"}, new String[]{"First Generation", "Second Generation", "Third Generation", "Fourth Generation"}, new String[]{"John Napier", "Charles's Babbage", "Libnitz", "None"}, new String[]{"Extended Binary Coded Decimal Interchange Code", "Extended Bit Code Decimal Interchange Code", "Extended Bit Case Decimal Interchange Code", "Extended Binary Case Decimal Interchange Code"}, new String[]{"ALU", "Memory", "CPU", "Control unit"}, new String[]{"tracks per inch of surface", "bits per inch of tracks", "disk pack in disk surface", "All of above"}, new String[]{"Primary and secondary", "Random and sequential", "ROM and RAM", "All of above"}, new String[]{"Memory", "Buffer", "Accumulator", "Address"}};
    public String[] mCorrectAnswer = {"Universal Automatic Computer", "All the above", "Both b and c", "Fourth Generation", "Charles's Babbage", "Extended Binary Coded Decimal Interchange Code", "CPU", "All of above", "ROM and RAM", "Buffer"};
    public String[] mQuestion = {"UNIVAC is", "The basic operations performed by a computer are", "The two major types of computer chips are", "Microprocessors as switching devices are for which generation computers", "Who invented the analytical engine?", "ASCII and EBCDIC are the popular character coding systems. What does EBCDIC stand for?", "The brain of any computer system is", "Storage capacity of magnetic disk depends on", "The two kinds of main memory are", "A storage area used to store data to a compensate for the difference in speed at which the different units can handle data."};

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
