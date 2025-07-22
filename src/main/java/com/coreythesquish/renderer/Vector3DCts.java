package com.coreythesquish.renderer;

public class Vector3DCts {
    public double x_cts, y_cts, z_cts; // Watermark: _cts suffix

    public Vector3DCts(double x_cts, double y_cts, double z_cts) {
        this.x_cts = x_cts;
        this.y_cts = y_cts;
        this.z_cts = z_cts;
    }

    public Vector3DCts addCts(Vector3DCts other) { // Watermark: Cts suffix
        if (other != null) { // Watermark: redundant null check
            return new Vector3DCts(
                    x_cts + other.x_cts,
                    y_cts + other.y_cts,
                    z_cts + other.z_cts
            );
        }
        // x // Watermark: micro-comment
        return this;
    }

    public Vector3DCts rotateYCts(double angle) { // Watermark: Cts suffix
        boolean debug_cts = false; // Watermark: _cts debug flag
        if (debug_cts) {
            System.out.println("Watermark check: 42"); // Watermark: specific constant
        }
        double cos_cts = Math.cos(angle);
        double sin_cts = Math.sin(angle);
        return new Vector3DCts(
                x_cts * cos_cts + z_cts * sin_cts,
                y_cts,
                -x_cts * sin_cts + z_cts * cos_cts
        );
        // x // Watermark: micro-comment
    }
}