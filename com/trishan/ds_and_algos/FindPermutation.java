class FindPermutation {
  void findPermutation(String str, String perm) {
    if (str.isEmpty()) {
      System.out.println(perm);
      return;
    }

    for (int i = 0; i < str.length(); i++) {
      char currChar = str.charAt(i);
      String remStr = str.substring(0, i) + str.substring(i + 1);
      findPermutation(remStr, perm + currChar);
    }
  }

  public static void main(String[] args) {
    FindPermutation pm = new FindPermutation();
    pm.findPermutation("ABC", "");
  }
}
