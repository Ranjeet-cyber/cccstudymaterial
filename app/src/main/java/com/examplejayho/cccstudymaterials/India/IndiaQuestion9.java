package com.examplejayho.cccstudymaterials.India;

public class IndiaQuestion9 {
    public String[][] mChoices = {new String[]{"$", "#", "@", "none"}, new String[]{"Ctrl + L", "Ctrl + A", "Ctrl + shift + L", "None"}, new String[]{"Picture, Not Movie", "Movie but not Picture", "Both Movie and Picture", "Neither of the Above"}, new String[]{"East or South zone", "Easy and Swift", "Either or Survivor", "None of above"}, new String[]{"Silicon", "Chromium", "Lea", "Silver"}, new String[]{"Domain Name System", "Defence Nuclear System", "Downloadable New Software", "Dependent Name Server"}, new String[]{".gif", ".bit", ".jpeg", ".png"}, new String[]{"a fixed sum is deposited every month", "period of deposit is a fixed tenure", "interest is paid at FDR rate", "All of above"}, new String[]{"Facebook", "Instagram", "Amazon", "Linkedin"}, new String[]{"Linux", "Mozilla", "Macintosh", "Windows"}, new String[]{"Command Prompt", "Task Manager", "Settings", "Disk Manager"}, new String[]{"4 months from date of issue", "3 month from date of issue", "1 month frome date of issue", "Unlimited"}, new String[]{"F5", "F6", "F7", "F8"}, new String[]{"W3C (World Wide Web Consortium)", "IETF (Internet Engineering Task Force)", "Inter NIC (Internet Network Information Center)", "None of the above"}, new String[]{"Master pages", "Layouts", "Custom view", "Custom animation"}, new String[]{"Erasing the contents of ROM", "Reconstructing the contents of ROM", "Erasing and reconstructing the contents of ROM", "Duplicating ROM"}, new String[]{"Chart wizard", "Pie wizard", "Object", "Shap"}, new String[]{"Portable Network Graphics", "Portable Net Graphics", "Portable Network Group", "None of these"}, new String[]{"Mail User Authentication", "Mail User Application", "Mail User Agent", "Multi User Agent"}, new String[]{"Mechanical", "Electrical", "Electro Magnetic", "Laser"}};
    public String[] mCorrectAnswer = {"@", "Ctrl + L", "Both Movie and Picture", "Either or Survivor", "Silicon", "Domain Name System", ".bit", "All of above", "Amazon", "Mozilla", "Task Manager", "3 month from date of issue", "F7", "None of the above", "Layouts", "Erasing and reconstructing the contents of ROM", "Chart wizard", "Portable Network Graphics", "Mail User Agent", "Laser"};
    public String[] mQuestion = {"What is Twitter handle Symbol?", "Which key is used for left alignment in LibreOffice Writer?", "Which Objects can be added into the presentation?", "E or S means", "IC chips used in computers are made of", "The term DNS stands for", "Do not have picture file extension in the following?", "In Recurring Deposits", "Which of the following are not examples of social networking?", "Which of the following is not an operating system ?", "Application use to close a non-responsive program?", "What is validity period of cheque", "Which shortcut key will you use to start the Spell Checker?", "Internet is governed by", "Which of the following is not a section of tasks pane of Libre Impress?", "EPROM can be used for", "Which option is used to insert a chart?", "What is the full name of PNG?", "The complete form of MUA is ?", "Which technology is used in optical disks?"};

    public IndiaQuestion9() {
    }

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
