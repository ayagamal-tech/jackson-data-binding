import com.fasterxml.jackson.annotation.JsonIgnore;

import java.util.List;

public class Video {
    private int video_id;
    private String title;
    private boolean is_available_in_4k;
    private Director director;

    @JsonIgnore
    private double internal_budget;

    private List<String> castMembers;

    public Video() {
        //default, without it I faced the mentioned error in README file
    }

    public Video(int video_id, String title, boolean is_available_in_4k, Director director, double internal_budget, List<String> castMembers) {
        this.video_id = video_id;
        this.title = title;
        this.is_available_in_4k = is_available_in_4k;
        this.director = director;
        this.internal_budget = internal_budget;
        this.castMembers = castMembers;
    }

    public void setVideo_id(int video_id) {
        this.video_id = video_id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setIs_available_in_4k(boolean is_available_in_4k) {
        this.is_available_in_4k = is_available_in_4k;
    }

    public void setDirector(Director director) {
        this.director = director;
    }

    public void setInternal_budget(double internal_budget) {
        this.internal_budget = internal_budget;
    }

    public void setCastMembers(List<String> castMembers) {
        this.castMembers = castMembers;
    }

    public int getVideo_id() {
        return video_id;
    }

    public String getTitle() {
        return title;
    }

    public boolean isIs_available_in_4k() {
        return is_available_in_4k;
    }

    public Director getDirector() {
        return director;
    }

    public double getInternal_budget() {
        return internal_budget;
    }

    public List<String> getCastMembers() {
        return castMembers;
    }

}