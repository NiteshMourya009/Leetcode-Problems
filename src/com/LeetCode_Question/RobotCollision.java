package com.LeetCode_Question;
import java.util.* ;
public class RobotCollision {
        public List<Integer> survivedRobotsHealths(int[] positions, int[] healths, String s) {
            int n = s.length();
            Stack<Integer> st = new Stack<>();
            List<Integer> list = new ArrayList<>();
            Stack<Character> newstack = new Stack<>();
            for (int i = 0; i < n; i++) {
                if (st.isEmpty()) {
                    newstack.push(s.charAt(i));
                    st.push(healths[i]);
                }
                else if (newstack.peek() == 'R' && s.charAt(i) == 'L') {
                    if (st.peek() == healths[i]) {
                        newstack.pop();
                        st.pop();
                    } else if (st.peek() > healths[i]) {
                        int val = st.peek();
                        st.pop();
                        newstack.pop();
                        list.add(val - 1);
                    }
                    else{
                        int val=newstack.peek();
                        newstack.pop();
                        st.pop();
                        list.add(val-1);
                    }
                }
                else if (newstack.peek() == 'L' && s.charAt(i) == 'R') {
                    if (st.peek() == healths[i]) {
                        newstack.pop();
                        st.pop();
                    }
                    else if (st.peek() > healths[i]) {
                        int val = st.peek();
                        st.pop();
                        newstack.pop();
                        list.add(val - 1);
                    }
                    else{
                        int val=newstack.peek();
                        newstack.pop();
                        st.pop();
                        list.add(val-1);
                    }
                }
                else {
                    int val = healths[i];
                    st.pop();
                    newstack.pop();
                    list.add(val - 1);
                }

            }


        Stack<Integer> pt = new Stack<>();
        int k = st.size();
        while (k > 0) {
            pt.push(st.pop());
            k--;
        }
        int x = pt.size();
        while (x > 0) {
            list.add(pt.pop());
            x--;
        }

        return list;
    }

    public static void main(String[] args) {
        RobotCollision rc = new RobotCollision();
        int[]position= {5,4,3,2,1} ;
        int[]health= {2,17,9,15,10} ;
        String direc = "RRRRR" ;
        List<Integer> result = rc.survivedRobotsHealths(position, health, direc);
        System.out.println(result);
    }
}