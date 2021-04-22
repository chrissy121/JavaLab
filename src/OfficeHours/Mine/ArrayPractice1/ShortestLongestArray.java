package OfficeHours.Mine.ArrayPractice1;

public class ShortestLongestArray {
    public static void main(String[] args) {
        String[] group = {"Samed", "Mustafa", "GokayYazar", "Chrissy", "MindyTurbat", "Tatiana", "Oogii72"};
        String longestName = group[0];
        String shortestName = group[0];

        for ( String member: group) {
            if (member.length() >=longestName.length()) {
                longestName = member;
            }
            if (member.length() <=shortestName.length()) {
                shortestName = member;
            }
        }

        System.out.println("Longest group member's name is = " + longestName);
        System.out.println("Shortest group member's name is = " + shortestName);
    }
}
