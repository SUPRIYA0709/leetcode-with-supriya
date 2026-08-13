// Last updated: 13/08/2026, 15:51:23
class Solution {
    public int secondsBetweenTimes(String startTime, String endTime) {
        String[]start=startTime.split(":");
        String[]end=endTime.split(":");
        int ss=Integer.parseInt(start[0])*3600+Integer.parseInt(start[1])*60+
            Integer.parseInt(start[2]);
        int ee=Integer.parseInt(end[0])*3600+Integer.parseInt(end[1])*60+
            Integer.parseInt(end[2]);
        return ee-ss;
    }
}