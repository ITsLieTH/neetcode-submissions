class Solution {
    public boolean canAttendMeetings(List<Interval> intervals) {

        intervals.sort((a, b) -> a.start - b.start);

        for (int k = 1; k < intervals.size(); k++) {

            int prevEnd = intervals.get(k - 1).end;
            int currStart = intervals.get(k).start;

            if (currStart < prevEnd) {
                return false;
            }

        }

        return true;
    }
}