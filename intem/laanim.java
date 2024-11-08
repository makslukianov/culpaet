#version 330 core

// Input vertex position and texture coordinates
in vec3 position;
in vec2 texCoord;

// Output fragment color
out vec4 fragColor;

// Uniform for the image texture
uniform sampler2D imageTexture;

void main()
{
    // Calculate the repeating texture coordinates
    vec2 repeatTexCoord = texCoord * 5.0; // Repeat the texture 5 times across the surface

    // Sample the image texture using the repeating coordinates
    vec4 texColor = texture(imageTexture, repeatTexCoord);

    // Output the fragment color
    fragColor = texColor;
}
