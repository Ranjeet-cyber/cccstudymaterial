package com.examplejayho.cccstudymaterials.Economy;

public class EconomyQuestion9 {
    public String[][] mChoices = {new String[]{"Sniffer script", "Spruff", "Spam", "Crepe"}, new String[]{"International Information Services", "Internet Information Services", "Important Information Services", "Instance Information Services"}, new String[]{"Kevin Systrom and Mike Krieger", "Marc Zuckerberg", "Bill gates", "None"}, new String[]{"Lucene", "Fedora", "Perl", "Apache"}, new String[]{"Routing", "Resolving", "Caching", "None of the above"}, new String[]{"Bank mail", "Bounced mail", "Return mail", "Spam"}, new String[]{"computer categaries", "connectivity", "Telecommuting", "None of the above"}, new String[]{"Google", "Yahoo", "Gopher", "Microsoft"}, new String[]{"Trash Mail", "Sent Mail", "Inbox", "Outbox"}, new String[]{"File", "Video clip", ".doc", "Parcel"}};
    public String[] mCorrectAnswer = {"Spam", "Internet Information Services", "Kevin Systrom and Mike Krieger", "Apache", "Caching", "Bounced mail", "Telecommuting", "Microsoft", "Trash Mail", "Parcel"};
    public String[] mQuestion = {"What is another name for junk mail?", "What is the full form of IIS?", "Who is the founder of instagram?", "______ is HTTP web server", "The process of keeping address in memory for future use is called?", "What is the return mail sent to the sender?", "Voice mail,E-mail,online service,the internet and the www are all example of", "Whose part is hotmail?", "Deleted email will be found in", "Can not send with email"};

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
