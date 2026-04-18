public class Track{
    String name;
    String trackSegment;
    int segmentID;
    String segmentType;
    int segmentLength;
    int cornerRadius;

    public Track(String name, String trackSegment, int segmentID, String segmentType, int segmentLength, int cornerRadius){
        this.name = name;
        this.trackSegment = trackSegment;
        this.segmentID = segmentID;
        this.segmentType = segmentType;
        this.segmentLength = segmentLength;
        this.cornerRadius = cornerRadius;
    }

    public int getCornerRadius() {
        return cornerRadius;
    }

    public String getName() {
        return name;
    }

    public int getSegmentID() {
        return segmentID;
    }

    public int getSegmentLength() {
        return segmentLength;
    }

    public String getSegmentType() {
        return segmentType;
    }

    public String getTrackSegment() {
        return trackSegment;
    }

    public void setCornerRadius(int cornerRadius) {
        this.cornerRadius = cornerRadius;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSegmentID(int segmentID) {
        this.segmentID = segmentID;
    }

    public void setSegmentLength(int segmentLength) {
        this.segmentLength = segmentLength;
    }

    public void setSegmentType(String segmentType) {
        this.segmentType = segmentType;
    }

    public void setTrackSegment(String trackSegment) {
        this.trackSegment = trackSegment;
    }
}