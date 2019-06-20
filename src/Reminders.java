public class Reminders {
    private String subject;
    private String words;
    private String name;

    public Reminders(String subject, String words, String name) {
        setSubject(subject);
        setWords(words);
        setName(name);
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getWords() {
        return words;
    }

    public void setWords(String words) {
        this.words = words;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return String.format("Subject:%s\n%s\n",subject,words);
    }
}
