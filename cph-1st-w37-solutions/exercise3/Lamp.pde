class Lamp {
  boolean turnedOn = false;
  float x, y;
  String lightColor;
  float socketDiameter = 200;
  float lampDiameter = socketDiameter * 0.95;

  public Lamp(String colorOfLight, float xPos, float yPos) {
    this.lightColor = colorOfLight;
    this.x = xPos;
    this.y = yPos;
  }

  public void render() {
    drawLightSocket();
    if (turnedOn) {
      glow();
    }
  }

  public void drawLightSocket() {
    fillFromString("grey");

    ellipseMode(CENTER);
    ellipse(x, y, socketDiameter, socketDiameter);
  }

  public void glow() {
    fillFromString(lightColor);
    ellipse(x, y, lampDiameter, lampDiameter);
  }

  public void turnOn() {
    turnedOn = true;
  }

  public void turnOff() {
    turnedOn = false;
  }
}
