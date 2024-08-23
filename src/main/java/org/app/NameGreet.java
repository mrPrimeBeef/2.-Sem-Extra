package org.app;

import java.util.ArrayList;
import java.util.List;

public class NameGreet {

    public String greet(Object name) {

        StringBuilder builder = new StringBuilder();

        if (name == null || (name instanceof String && ((String) name).isEmpty())) {
            builder.append("Hello, my friend.");
        } else if (name instanceof String) {
            String nameStr = (String) name;
            if (nameStr.equals(nameStr.toUpperCase())) {
                builder.append("HELLO ").append(nameStr).append("!");
            } else {
                builder.append("Hello, ").append(nameStr).append(".");
            }
        } else if (name instanceof String[]) {
            String[] names = (String[]) name;

            List<String> shoutingNames = new ArrayList<>();
            List<String> normalNames = new ArrayList<>();

            for (int i = 0; i < names.length; i++) {
                if (names[i].equals(names[i].toUpperCase())) {
                    shoutingNames.add(names[i]);

                } else if (names[i].contains(",")) {
                    String[] parts = names[i].split(",");
                    for (String s : parts){
                        normalNames.add(s);
                    }
                } else{
                    normalNames.add(names[i]);
                }
            }

            String[] shoutingArray = shoutingNames.toArray(new String[0]);
            String[] normalNamesArray = normalNames.toArray(new String[0]);

            if (names.length == 2) {
                builder.append("Hello, ").append(String.join(" and ", names)).append(".");
            } else if (names.length > 2) {
                builder.append("Hello, ");
                for (int i = 0; i < names.length; i++) {
                    if (names[i].equals(names[i].toUpperCase())) {

                    } else {
                        if (i == names.length - 1) {
                            builder.append("and ").append(names[i]);
                        } else {
                            builder.append(normalNamesArray[i]);
                            if (shoutingArray.length == 0){
                                builder.append(", ");
                            } else {
                                builder.append(" ");
                            }
                        }
                    }

                }
                if (shoutingArray.length > 0){
                    for (int i = 0; i < shoutingArray.length; i++ ){
                        builder.append(". AND HELLO ").append(shoutingArray[i]);
                    }
                } else {
                    builder.append(".");
                }
            }
        }

        return builder.toString();

    }
}