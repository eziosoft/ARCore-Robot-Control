#ifdef GL_ES
precision mediump float;
precision mediump int;
#endif

varying vec4 vertColor;
uniform float maxDepth;

void main() {

  float depth = gl_FragCoord.z / gl_FragCoord.w;
  gl_FragColor = vec4(vec3(vertColor - depth/maxDepth), 1) ;

}