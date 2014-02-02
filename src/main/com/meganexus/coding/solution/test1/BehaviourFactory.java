package com.meganexus.coding.solution.test1;

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

    public abstract Behaviour getBehaviour();
}
