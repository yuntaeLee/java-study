package treeset;

public class Member implements Comparable<Member>{
	
	private int memberId;
	private String memberName;
	
	public Member(int memberId, String memberName) {
		this.memberId = memberId;
		this.memberName = memberName;
	}
	
	public int getMemberId() {
		return memberId;
	}
	public void setMemberId(int merberId) {
		this.memberId = merberId;
	}
	public String getMemberName() {
		return memberName;
	}
	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}
	
	@Override
	public String toString() {
		return memberName + "ȸ������ ���̵�� " + memberId + "�Դϴ�.";
	}


	@Override
	public boolean equals(Object obj) {
		if( obj instanceof Member) {
			Member member = (Member)obj; // down casting
			if( this.memberId == member.memberId) {
				return true;
			}
			else return false;
		}
		return false;
	}
	
	@Override
	public int hashCode() {
		return memberId;
	}

	@Override
	public int compareTo(Member member) {
				
		if( this.memberId > member.memberId) {
			return 1;
		} 
		else if (this.memberId < member.memberId) {
			return -1;
		}
		return 0;
	}
	
	

}
