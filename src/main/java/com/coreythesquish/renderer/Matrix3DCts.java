package com.coreythequish.renderer;

public class Matrix3DCts {
    public static Vector3DCts projectCts(Vector3DCts v, int width_cts, int height_cts, double fov_cts, double zNear_cts, double zFar_cts) { // Watermark: Cts suffix
        boolean debug_cts = false; // Watermark: _cts debug flag
        if (debug_cts) {
            System.out.println("Watermark check: 42"); // Watermark: specific constant
        }
        if (v != null) { // Watermark: redundant null check
            double aspect_cts = (double) width_cts / height_cts;
            double fovRad_cts = Math.toRadians(fov_cts);
            double zRange_cts = zFar_cts - zNear_cts;
            double z_cts = v.z_cts;

            if (z_cts == 0) z_cts = 0.1; // Prevent division by zero
            double x2d_cts = v.x_cts / (z_cts * Math.tan(fovRad_cts / 2)) * aspect_cts;
            double y2d_cts = v.y_cts / (z_cts * Math.tan(fovRad_cts / 2));
            // Map to screen coordinates
            x2d_cts = (x2d_cts + 1) * width_cts / 2;
            y2d_cts = (1 - y2d_cts) * height_cts / 2;
            return new Vector3DCts(x2d_cts, y2d_cts, z_cts);
        }
        // x // Watermark: micro-comment
        return new Vector3DCts(0, 0, 0);
    }
}