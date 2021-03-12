HashMap<String, int[]> getColorHashmap() {
  HashMap<String, int[]> colors = new HashMap<String, int[]>();
  
  int[] red = {255, 0, 0, 255};
  int[] yellow = {255, 255, 0, 255};
  int[] green = {0, 255, 0, 255};
  int[] black = {0, 0, 0, 255};
  int[] grey = {180, 180, 180, 255};
  colors.put("red", red);
  colors.put("yellow", yellow);
  colors.put("green", green);
  colors.put("black", black);
  colors.put("grey", grey);
  
  return colors;
}
