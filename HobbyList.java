package human_model;

import java.util.List;

public class HobbyList {

    private List<String> hobbies;

    int addHobby(String hobby) {
        hobbies.add(hobby);
        return hobbies.size();
    }
}
