package behavioral.observer;

public enum Message {


        REGISTERED {
            public String toString() {
                return " joined chatroom";
            }
        },
         LOGGED_OUT {
            public String toString() {
                return " left chatroom";
            }
        }

}
