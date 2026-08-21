class Solution:
    def invertTree(self, root: Optional[TreeNode]) -> Optional[TreeNode]:
        if root is None:
            return None

        left_inverted = self.invertTree(root.left)
        right_inverted = self.invertTree(root.right)

        root.left = right_inverted
        root.right = left_inverted

        return root