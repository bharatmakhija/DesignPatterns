package com.company.MementoDP;

public class File {

    private String name;
    private StringBuilder content;

    public File(String name) {
        this.name = name;
        this.content = new StringBuilder();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "File{" +
                "name='" + name + '\'' +
                ", content=" + content +
                '}';
    }

    public StringBuilder getContent() {
        return content;
    }

    public void setContent(StringBuilder content) {
        this.content = content;
    }

    public void write(String str){
        this.content.append(str);
    }

    public FileMomento save(){
        return new FileMomento(this.name, this.content);
    }

    public void undo(Object object){
        FileMomento fileMomento = (FileMomento)object;
        this.name = fileMomento.name;
        this.content = fileMomento.content;
    }

    private static class FileMomento{

        private String name;
        private StringBuilder content;

        public FileMomento(String name, StringBuilder content) {
            this.name = name;
            this.content = new StringBuilder(content); // Here we are doing deep copy i.e. everytime a new object will be created so actual and copy refer to different
            // memory locations
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public StringBuilder getContent() {
            return content;
        }

        public void setContent(StringBuilder content) {
            this.content = content;
        }
    }
}
