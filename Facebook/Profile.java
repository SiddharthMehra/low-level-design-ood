package Facebook;

import java.util.List;

public class Profile {

    private String gender;
    private byte[] picture;
    private byte[] coverPhoto;
    private List<User> friends;

    private List<User> usersFollowed;
    private List<Page> pagesFollowed;
    private List<Group> groupsJoiner;

    private ProfilePrivacy privacy;

    private List<Work> workExperience;
    private List<Education> education;
    private List<Places> places;

    public boolean addExperience(Work work) {
        return true;
    }

    public boolean addEducation(Education education) {
        return true;
    }

    public boolean addProfilePicture(byte[] image) {
        return true;
    }

    public boolean addCoverPhoto(byte[] image ) {
        return true;
    }

    public boolean addGender(String gender ) {
        return true;
    }
}
