package com.cbfacademy;

import java.util.HashMap;
import java.util.Map;
import java.util.List;

public class FileExtension {

    boolean check(String filename) throws FilenameException {
        if (filename == "" || filename == null) {
            throw new FilenameException("The file is empty or null!");
        }
        return filename.endsWith(".java");
    }

    Map<String, Integer> map(List<String> filenames) {
        Map mappedFiles = new HashMap<String, Integer>();

        for (String filename : filenames) {
            try {
                Integer isFile = check(filename) ? 1 : 0;
                mappedFiles.put(filename, isFile);

            } catch (FilenameException e) {
                mappedFiles.put(filename, -1);
            }
        }
        return mappedFiles;
    }

}

// public class FileExtension {

// public boolean Check(String filename) {

// if (filename == null || filename = "") {

// }
// return filename.endsWith(".java");

// }

// HashMap<String, Integer> map(List<String> filenames) {
// for (String filename : filenames) {

// }
// return new Map<String, Integer> () {
// "foo": 42;
// }
// }

// }
