package assignment3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.stream.Collectors;

public class Team {
   private ArrayList<TeamMember> members = new ArrayList<>();

    /**
     *
     * @param m an instance of TeamMember
     * Add a teammember to the instance field members
     */
    public void addTeamMember(TeamMember m) {
        members.add(m);
    }

    // Nothing to do here!
    public void addTeamMembers(ArrayList<TeamMember> t) {
        members.addAll(t);
    }

    // Nothing to do here!
    public ArrayList<TeamMember> getAllMembers() {
       return members;
    }

    /**
     *
     * @param m the TeamMember to remove
     * @return if a TeamMember was removed
     */
    public boolean removeTeamMember(TeamMember m){
        return members.remove(m);
    }

    /**
     *
     * @return the next available id
     * The id must start at 0. If a members is removed from the list,
     * the id must be freed for the next member.
     * The next id must always be the smallest possible id number
     *
     * * This is hard. Skip this for now if you don't know how to do it
     */

    public int getNextId() {
        return members.stream().filter(member -> member.getId() != members.indexOf(member)).findFirst().map(members::indexOf).orElse(members.size());
    }

    /**
     *
     * @param role, a String representing the role of the TeamMember
     * @return an ArrayList of all TeamMember that has the specified role
     */
    public ArrayList<TeamMember> retriveMembersByRole(String role) {
        var filteredMembers = members.stream().filter(memberRole -> memberRole.getRole().equals(role));
        return filteredMembers.collect(Collectors.toCollection(ArrayList::new));
    }

    /**
     * Sort the TeamMember list in ascending order by name
     * * This is hard. Skip this for now if you don't know how to do it
     */
    public void sortByNameAsc() {

        Comparator<TeamMember> compareByName = Comparator.comparing(TeamMember::getName);

        Collections.sort(members, compareByName);
    }

    public void sortByRoleDesc() {

        Comparator<TeamMember> compareByRole = Comparator.comparing(TeamMember::getRole);

        Collections.sort(members, compareByRole.reversed());
    }

}
