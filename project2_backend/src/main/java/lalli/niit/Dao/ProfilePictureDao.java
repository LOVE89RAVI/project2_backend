package lalli.niit.Dao;

import lalli.niit.models.ProfilePicture;

public interface ProfilePictureDao {
void saveOrUpdateProfilePicture(ProfilePicture profilePicture);
ProfilePicture getProfilePicture(String email);
}