package com.meganexus.code.codingtests.test1.solution;

public enum BehaviourFactory {

    ONE {

        @Override
        public Behaviour getBehaviour() {
            return new TypeOneBehaviour();
        }
    },
    TWO {

        @Override
        public Behaviour getBehaviour() {
            return new TypeTwoBehaviour();
        }
    },
    THREE {

        @Override
        public Behaviour getBehaviour() {
            return new TypeThreeBehaviour();
        }
    },
    FOUR {

        @Override
        public Behaviour getBehaviour() {
            return new TypeFourBehaviour();
        }
    },
    FIVE {

        @Override
        public Behaviour getBehaviour() {
            return new TypeFiveBehaviour();
        }
    },
    SIX {

        @Override
        public Behaviour getBehaviour() {
            return new TypeSixBehaviour();
        }
    };

    private BehaviourFactory() {

    }

    public abstract Behaviour getBehaviour();

    public static Behaviour getBehaviour(String type) {

        return BehaviourFactory.valueOf(type).getBehaviour();
    }
}
