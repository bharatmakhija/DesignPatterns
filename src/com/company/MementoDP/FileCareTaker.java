package com.company.MementoDP;

public class FileCareTaker {

    private Object object;

    public void save(File file){
       object =  file.save();
    }

    public void undoToLastSaved(File file){
        file.undo(object);
    }
}
