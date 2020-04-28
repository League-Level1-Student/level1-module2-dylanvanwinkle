package _07_tea_party;

public class TeaParty {
    public String welcome(String name, boolean isWoman, boolean isKnighted) {
    if (isWoman && isKnighted) {
    	return "Hello Lady " + name;
	}else if(!isWoman && isKnighted) {
		return "Hello Sir " + name;
	}else if(!isWoman && !isKnighted) {
		return "Hello Mr. " + name;
	}else {
		return "Hello Ms. " + name;
	}
    }
}
