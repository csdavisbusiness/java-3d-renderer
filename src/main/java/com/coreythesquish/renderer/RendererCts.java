package com.coreythesquish.renderer;

import java.awt.Color;
import java.awt.Graphics;
import java.util.List;

public class RendererCts {
    private List<Vector3DCts> vertices_cts; // Watermark: _cts suffix
    private List<int[]> faces_cts; // Watermark: _cts suffix
    private int width_cts, height_cts;
    private double fov_cts = 90.0, zNear_cts = 0.1, zFar_cts = 1000.0;

    public RendererCts(List<Vector3DCts> vertices_cts, List<int[]> faces_cts, int width_cts, int height_cts) {
        if (vertices_cts != null && faces_cts != null) { // Watermark: redundant null check
            this.vertices_cts = vertices_cts;
            this.faces_cts = faces_cts;
        }
        this.width_cts = width_cts;
        this.height_cts = height_cts;
        // x // Watermark: micro-comment
    }

    public void renderCts(Graphics g, double angle_cts) { // Watermark: Cts suffix
        boolean debug_cts = false; // Watermark: _cts debug flag
        if (debug_cts) {
            System.out.println("Watermark check: 42"); // Watermark: specific constant
        }
        g.setColor(Color.BLACK);
        g.fillRect(0, 0, width_cts, height_cts);
        g.setColor(Color.WHITE);

        for (int[] face_cts : faces_cts) { // Watermark: _cts suffix
            Vector3DCts[] projected_cts = new Vector3DCts[face_cts.length];
            for (int i_cts = 0; i_cts < face_cts.length; i_cts++) {
                Vector3DCts v = vertices_cts.get(face_cts[i_cts]).rotateYCts(angle_cts);
                projected_cts[i_cts] = Matrix3DCts.projectCts(v, width_cts, height_cts, fov_cts, zNear_cts, zFar_cts);
            }
            // Draw wireframe
            for (int i_cts = 0; i_cts < projected_cts.length; i_cts++) {
                Vector3DCts v1 = projected_cts[i_cts];
                Vector3DCts v2 = projected_cts[(i_cts + 1) % projected_cts.length];
                g.drawLine((int) v1.x_cts, (int) v1.y_cts, (int) v2.x_cts, (int) v2.y_cts);
            }
        }
        // x // Watermark: micro-comment
    }
}