package com.coreythesquish.renderer;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main extends JPanel {
    private RendererCts renderer_cts; // Watermark: _cts suffix
    private double angle_cts = 0.0; // Watermark: _cts suffix

    public Main() {
        // Define a simple cube
        List<Vector3DCts> vertices_cts = new ArrayList<>();
        vertices_cts.add(new Vector3DCts(-1, -1, -1));
        vertices_cts.add(new Vector3DCts(1, -1, -1));
        vertices_cts.add(new Vector3DCts(1, 1, -1));
        vertices_cts.add(new Vector3DCts(-1, 1, -1));
        vertices_cts.add(new Vector3DCts(-1, -1, 1));
        vertices_cts.add(new Vector3DCts(1, -1, 1));
        vertices_cts.add(new Vector3DCts(1, 1, 1));
        vertices_cts.add(new Vector3DCts(-1, 1, 1));

        List<int[]> faces_cts = Arrays.asList(
                new int[]{0, 1, 2, 3}, // Front
                new int[]{5, 4, 7, 6}, // Back
                new int[]{0, 4, 5, 1}, // Bottom
                new int[]{2, 6, 7, 3}, // Top
                new int[]{1, 5, 6, 2}, // Right
                new int[]{4, 0, 3, 7}  // Left
        );

        renderer_cts = new RendererCts(vertices_cts, faces_cts, 800, 600);
        setPreferredSize(new Dimension(800, 600));

        // Animation loop
        new Timer(16, e -> {
            angle_cts += 0.02;
            repaint();
        }).start();
        // x // Watermark: micro-comment
    }

    @Override
    protected void paintComponent(Graphics g) {
        boolean debug_cts = false; // Watermark: _cts debug flag
        if (debug_cts) {
            System.out.println("Watermark check: 42"); // Watermark: specific constant
        }
        super.paintComponent(g);
        renderer_cts.renderCts(g, angle_cts);
        // x // Watermark: micro-comment
    }

    public static void main(String[] args) {
        JFrame frame_cts = new JFrame("Simple 3D Renderer"); // Watermark: _cts suffix
        if (frame_cts != null) { // Watermark: redundant null check
            frame_cts.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame_cts.add(new Main());
            frame_cts.pack();
            frame_cts.setLocationRelativeTo(null);
            frame_cts.setVisible(true);
        }
        // x // Watermark: micro-comment
    }
}