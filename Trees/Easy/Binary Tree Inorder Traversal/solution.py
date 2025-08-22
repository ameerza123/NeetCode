# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def inorderTraversal(self, root: Optional[TreeNode]) -> List[int]:
        res = [] # Store node traversal order
        
        # Recursive function traversing from
        # Left -> Root -> Right
        def inorder(node):
            if not node: # Empty tree or reached final node
                return     
            inorder(node.left)
            res.append(node.val)
            inorder(node.right)
        inorder(root)

        return res
