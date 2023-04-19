package Model;

public class AVLTree<E extends Comparable<E>> {

    private class Node {
        E key;
        int height;
        Node left;
        Node right;

        Node(E key) {
            this.key = key;
            this.height = 1;
            this.left = null;
            this.right = null;
        }
    }

    private Node root;
    private int count;

    public AVLTree() {
        root = null;
        count = 0;
    }

    // Método add (insertar)
    public void add(E key) {
        if (!search(key)) {
            root = insert(root, key);
            count++;
        }
    }

    // Método get (buscar)
    public E get(E key) {
        Node result = searchNode(root, key);
        return result == null ? null : result.key;
    }

    // Método remove (eliminar)
    public boolean remove(E key) {
        if (search(key)) {
            root = delete(root, key);
            count--;
            return true;
        }
        return false;
    }

    // Método count (número de nodos)
    public int count() {
        return count;
    }

    // Método isEmpty (verificar si está vacío)
    public boolean isEmpty() {
        return root == null;
    }

    // Método privado recursivo para insertar una clave en el árbol AVL
    private Node insert(Node node, E key) {
        if (node == null) {
            return new Node(key);
        }

        if (key.compareTo(node.key) < 0) {
            node.left = insert(node.left, key);
        } else {
            node.right = insert(node.right, key);
        }

        node.height = 1 + Math.max(height(node.left), height(node.right));
        int balance = getBalance(node);

        // Caso Left-Left
        if (balance > 1 && key.compareTo(node.left.key) < 0) {
            return rotateRight(node);
        }

        // Caso Right-Right
        if (balance < -1 && key.compareTo(node.right.key) > 0) {
            return rotateLeft(node);
        }

        // Caso Left-Right
        if (balance > 1 && key.compareTo(node.left.key) > 0) {
            node.left = rotateLeft(node.left);
            return rotateRight(node);
        }

        // Caso Right-Left
        if (balance < -1 && key.compareTo(node.right.key) < 0) {
            node.right = rotateRight(node.right);
            return rotateLeft(node);
        }

        return node;
    }

    // Método para obtener la altura del nodo
    private int height(Node node) {
        return node == null ? 0 : node.height;
    }

    // Método para obtener el factor de equilibrio del nodo
    private int getBalance(Node node) {
        return node == null ? 0 : height(node.left) - height(node.right);
    }

    // Método para rotar a la derecha
    private Node rotateRight(Node y) {
        Node x = y.left;
        Node T2 = x.right;

        x.right = y;
        y.left = T2;

        y.height = 1 + Math.max(height(y.left), height(y.right));
        x.height = 1 + Math.max(height(x.left), height(x.right));

        return x;
    }

    // Método para rotar a la izquierda
    private Node rotateLeft(Node x) {
        Node y = x.right;
        Node T2 = y.left;

        y.left = x;
        x.right = T2;

        x.height = 1 + Math.max(height(x.left), height(x.right));
        y.height = 1 + Math.max(height(y.left), height(y.right));

        return y;
    }

    // Método privado recursivo para eliminar una clave en el árbol AVL
    private Node delete(Node node, E key) {
        if (node == null) {
            return node;
        }

        if (key.compareTo(node.key) < 0) {
            node.left = delete(node.left, key);
        } else if (key.compareTo(node.key) > 0) {
            node.right = delete(node.right, key);
        } else {
            if (node.left == null || node.right == null) {
                node = (node.left != null) ? node.left : node.right;
            } else {
                node.key = minValue(node.right);
                node.right = delete(node.right, node.key);
            }
        }

        if (node == null) {
            return node;
        }

        node.height = 1 + Math.max(height(node.left), height(node.right));
        int balance = getBalance(node);

        // Caso Left-Left
        if (balance > 1 && getBalance(node.left) >= 0) {
            return rotateRight(node);
        }

        // Caso Right-Right
        if (balance < -1 && getBalance(node.right) <= 0) {
            return rotateLeft(node);
        }

        // Caso Left-Right
        if (balance > 1 && getBalance(node.left) < 0) {
            node.left = rotateLeft(node.left);
            return rotateRight(node);
        }

        // Caso Right-Left
        if (balance < -1 && getBalance(node.right) > 0) {
            node.right = rotateRight(node.right);
            return rotateLeft(node);
        }

        return node;
    }

    private E minValue(Node node) {
        E minValue = node.key;
        while (node.left != null) {
            minValue = node.left.key;
            node = node.left;
        }
        return minValue;
    }

    private Node searchNode(Node node, E key) {
        if (node == null || node.key.compareTo(key) == 0) {
            return node;
        }

        if (key.compareTo(node.key) < 0) {
            return searchNode(node.left, key);
        } else {
            return searchNode(node.right, key);
        }
    }

    // Método público para buscar una clave en el árbol AVL (retorna true si se encuentra)
    public boolean search(E key) {
        return searchNode(root, key) != null;
    }

    // Método para imprimir el árbol en orden ascendente
    public void inOrderTraversal() {
        inOrderTraversal(root);
        System.out.println();
    }

    private void inOrderTraversal(Node node) {
        if (node == null) {
            return;
        }
        inOrderTraversal(node.left);
        System.out.print(node.key + " ");
        inOrderTraversal(node.right);
    }

}
