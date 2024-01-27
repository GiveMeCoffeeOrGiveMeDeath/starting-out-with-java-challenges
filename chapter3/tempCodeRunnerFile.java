 (time1 > time2 && time1 > time3) {
            if (time2 > time3) {
                System.out.println("In order runner: " + runner1 + " with a time of " + time1);
                System.out.println("In order runner: " + runner2 + " with a time of " + time2);
                System.out.println("In order runner: " + runner3 + " with a time of " + time3);
            } else {
                System.out.println("In order runner: " + runner1 + " with a time of " + time1);
                System.out.println("In order runner: " + runner3 + " with a time of " + time3);
                System.out.println("In order runner: " + runner2 + " with a time of " + time2);
            }
        } else if (time2 > time1 && time3 > time2) {
            if (time1 > time3) {
                System.out.println("In order runner: " + runner2 + " with a time of " + time2);
                System.out.println("In order runner: " + runner1 + " with a time of " + time1);
                System.out.println("In order runner: " + runner3 + " with a time of " + time3);
            } else {
                System.out.println("In order runner: " + runner2 + " with a time of " + time2);
                System.out.println("In order runner: " + runner3 + " with a time of " + time3);
                System.out.println("In order runner: " + runner1 + " with a time of " + time1);
            }
        } else if (time3 > time2 && time1 > time3) {
            if (time2 > time1) {
                System.out.println("In order runner: " + runner3 + " with a time of " + time3);
                System.out.println("In order runner: " + runner2 + " with a time of " + time2);
                System.out.println("In order runner: " + runner3 + " with a time of " + time3);
            } else {
                System.out.println("In order runner: " + runner3 + " with a time of " + time3);
                System.out.println("In order runner: " + runner1 + " with a time of " + time1);
                System.out.println("In order runner: " + runner2 + " with a time of " + time2);
            }
        }