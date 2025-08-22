# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right

class Solution:
    def invertTree(self, root: Optional[TreeNode]) -> Optional[TreeNode]:     
        if not root: return None # Empty tree or no more nodes

        # Swap node positions
        root.left = root.right
        root.right = root.left

        # Recursive call
        self.invertTree(root.left)
        self.invertTree(root.right)

        return root