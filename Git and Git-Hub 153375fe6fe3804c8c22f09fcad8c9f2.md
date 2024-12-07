# Git and Git-Hub

## Basic command line commands

## Getting started with Git

---

### Git Config: Username and Email

### 1. **Starting Git Config (Set Up Initial Username & Email)**

To set up your username and email in Git for the first time, use the following commands:

- **Set username:**
    
    ```bash
    git config --global user.name "Your Name"
    ```
    
- **Set email:**
    
    ```bash
    git config --global user.email "your-email@example.com"
    ```
    

These commands will set the username and email for all repositories on your system. The `--global` flag ensures that these details are used in every Git repository unless explicitly overridden.

### 2. **Changing Git Config (Update Username & Email)**

If you need to change your Git username or email, follow these steps:

- **Change username:**
    
    ```bash
    git config --global user.name "Your New Username"
    ```
    
- **Change email:**
    
    ```bash
    git config --global user.email "your-new-email@example.com"
    ```
    

If you want to change the details for a specific repository (local repository), use the following commands within that repository folder:

- **Change username for a specific repo:**
    
    ```bash
    git config user.name "Your New Username"
    ```
    
- **Change email for a specific repo:**
    
    ```bash
    git config user.email "your-new-email@example.com"
    ```
    

### 3. **Checking Git Config (Verify Username & Email)**

To check your current username and email configuration, use the following commands:

- **Check global username:**
    
    ```bash
    git config --global user.name
    ```
    
- **Check global email:**
    
    ```bash
    git config --global user.email
    ```
    

For checking the username and email specific to the current repository:

- **Check local username:**
    
    ```bash
    git config user.name
    ```
    
- **Check local email:**
    
    ```bash
    git config user.email
    ```
    

---

# Git Operations

## 1. Initializing a Git Repository

### Command:

```bash
Copy code
git init

```

- Initializes an empty Git repository in the `C:/Users/91808/Desktop/project/` directory.

---

## 2. Staging data to the Repository

### Command:

```bash
Copy code
git add <file or folder or data"

```

- Stages `names.txt` for commit.

---

## 3. Committing Changes

### Command:

```bash
Copy code
git commit -m "file added"

```

- Commits the changes (i.e., `names.txt` file added) with a message.

---

## 4. Checking the Git Status

### Command:

```bash
Copy code
git status
```

- Displays the current state of the repository, showing files added, modified, or untracked.

---

## 5. Viewing Commit History

### Command:

```bash
Copy code
git log
```

- Shows the commit history, including commit hash, author, date, and message.

---

## 8. Resetting a Commit

### Command:

```bash
Copy code
git reset <commit_hash>
```

- Resets the repository to a previous commit. This can be done with three options:

### Types of `git reset`:

1. **Hard Reset** (`git reset --hard <commit_hash>`):
    - **Effect**: Resets both the staging area (index) and working directory to the state of the specified commit. Any local changes will be lost.
    - **Use Case**: When you want to discard all changes made after a specific commit.
2. **Soft Reset** (`git reset --soft <commit_hash>`):
    - **Effect**: Resets only the commit history, leaving changes in the working directory and staging area intact. This allows you to re-commit changes after resetting.
    - **Use Case**: When you want to move back in history but keep the changes staged for re-commit.
3. **Mixed Reset** (`git reset --mixed <commit_hash>`):
    - **Effect**: Resets the commit history and unstages files, but keeps the changes in the working directory. This is the default behavior of `git reset` if no option is specified.
    - **Use Case**: When you want to undo a commit but keep your local changes unstaged.

---

## 9. Restoring Files to Unstage Changes

### **Unstage All Changes**

```bash
bash
Copy code
git reset

```

- Removes all staged changes (keeps changes in the working directory).

### **Unstage a Specific File**

```bash
bash
Copy code
git reset <file>

```

- Removes the specified file from the staging area (changes stay in the working directory).

---

### **Discard Changes**

### **Discard All Changes**

```bash
bash
Copy code
git reset --hard

```

- Completely resets the working directory and staging area to match the latest commit.
- **Warning:** This will delete all uncommitted changes.

---

## **Save Changes**

- **Command**:
    
    ```bash
    bash
    Copy code
    git stash
    
    ```
    
- **Description**:Saves all your changes (staged and unstaged) and restores the working directory to the last commit.

---

## **2. Apply Changes**

- **Command**:
    
    ```bash
    bash
    Copy code
    git stash pop
    
    ```
    
- **Description**:Applies the most recent stash and removes it from the stash list.

---

## **3. Clear Stash**

- **Command**:
    
    ```bash
    bash
    Copy code
    git stash clear
    
    ```
    
- **Description**:Deletes all stashes from the list.

---

## **4. List Stashes**

- **Command**:
    
    ```bash
    bash
    Copy code
    git stash list
    
    ```
    
- **Description**:Shows all the stashes you have saved.

# How Git Works

---

## **1. Connecting Your Remote Repository to Local Repository**

- **Command**:
To connect your local repository to a remote repository:
    
    ```bash
    git remote add origin <remote_repo_url>
    
    ```
    

---

## **2. Pushing Local Changes to Remote Repository**

- **Command**:
To push local changes to the remote repository (to `origin` and `master` branch):
    
    ```bash
    git push origin master
    
    ```
    

---

## **3. View All Remote URLs**

- **Command**:
To see the remote URLs connected to your local repository:
    
    ```bash
    git remote -v
    
    ```
    

---

## **4. Avoid Committing Directly on the Main Branch**

- **Best Practice**:
Never commit directly to the `main` branch to prevent conflicts. Always use separate branches for features or fixes.

---

## **5. Shifting the HEAD to a Branch**

- **Command**:`HEAD` is a pointer to the current branch. To switch between branches, use:
    
    ```bash
    git checkout <branch_name>
    
    ```
    

---

## **6. Merging Your Branch into the Main Branch**

- **Command**:
After completing a feature or fix, merge your branch into the `main` branch:
    
    ```bash
    git checkout main
    git merge <branch_name>
    ```
    

---

# **Working with Existing Projects on GitHub**

---

When you don't have access to modify a repository, you can **fork** the project. This creates a copy of the repository under your GitHub account, where you have full access. Follow the steps below:

---

## **1. Cloning the Forked Project to Your Local Machine**

To get a local copy of the project you forked:

```bash
git clone <forked_repo_url>

```

---

## **2. Set Upstream URL for the Original Repo**

The original repo that you forked from is called the **upstream** repository. Set it up with the following command:

```bash
git remote add upstream <original_repo_url>

```

---

## **3. Creating a New Branch**

It's a good practice to create a new branch for any new feature or bug fix.

```bash
git checkout -b <new_branch_name>

```

---

## **4. Stage, Commit, and Push**

1. **Stage** your changes:
    
    ```bash
    git add .
    
    ```
    
2. **Commit** your changes:
    
    ```bash
    git commit -m "Your commit message"
    
    ```
    
3. **Push** your changes to your forked repository (origin):
    
    ```bash
    git push origin <branch_name>
    
    ```
    

---

## **5. Always Use Separate Branches for Different Pull Requests**

- **Best Practice**: Always use **1 branch = 1 pull request**.
- Never commit directly to the `main` branch.

---

## **6. Removing a Commit**

1. **Remove a commit** using the **reset** command:
    
    ```bash
    git reset HEAD~1
    
    ```
    
    This will unstage the changes.
    
2. **Stage** the remaining changes:
    
    ```bash
    git add .
    
    ```
    
3. If you need to stash changes that aren't committed yet:
    
    ```bash
    git stash
    
    ```
    
4. **Force push** the changes to your forked repository (origin):
    
    ```bash
    git push origin <branch_name> --force
    
    ```
    

---

## **7. Keeping Your Fork Updated with the Original Repo**

### **Step 1: Shift the HEAD to Your Main Branch**

```bash
git checkout main

```

### **Step 2: Fetch Changes from the Original Repository (Upstream)**

```bash
git fetch upstream

```

### **Step 3: Reset Your Main Branch to Match Upstream's Main Branch**

```bash
git reset --hard upstream/main

```

### **Step 4: Verify Your Changes**

```bash
git log

```

(Press `q` to exit the log view)

### **Step 5: Push the Changes to Your Forked Repository (Origin)**

```bash
git push origin main --force

```

---

## **8. Method 2: Fetch and Push All Changes at Once**

1. **Fetch** changes from upstream:
    
    ```bash
    git fetch upstream
    
    ```
    
2. **Push** the changes to your forked repository (origin):
    
    ```bash
    git push origin main
    
    ```
    

---

## **9. Method 3: Update Using the GitHub Fetch Upstream Button**

- You can use the **Fetch Upstream** button on your forked repository's GitHub page to update your fork with the latest changes from the original repo.

---

## **10. Squashing Multiple Commits into One Commit**

If you have multiple commits that you want to squash into a single commit:

1. Run an interactive rebase:
    
    ```bash
    git rebase -i HEAD~4
    
    ```
    
2. In the editor, keep **pick** for the first commit and change the other commits to **squash**.
3. Complete the rebase and force push the changes:
    
    ```bash
    git push origin <branch_name> --force
    
    ```
    

---

## **11. Resolving Merge Conflicts**

### **What are Merge Conflicts?**

Merge conflicts occur when multiple users edit the same line of code. Git can't automatically merge these changes.

### **How to Resolve Merge Conflicts?**

1. Open the conflicting files.
2. Manually choose the correct changes.
3. Remove conflict markers (e.g., `<<<<<<<`, `=======`, `>>>>>>>`).
4. **Stage** and **commit** the resolved files:
    
    ```bash
    git add <resolved_file>
    git commit -m "Resolved merge conflict"
    ```
    

---

## Git Branch
The `git branch` command in Git is used to manage branches in a repository. Branches are essentially pointers to snapshots of your changes and allow for independent development paths within the same repository.
---

### **1. List all branches:**
```bash
git branch
```
This lists all branches in the repository. The current branch is highlighted with an asterisk `*`.

---

### **2. Create a new branch:**
```bash
git branch <branch_name>
```
Creates a new branch with the specified name but does not switch to it.

---

### **3. Switch to another branch:**
```bash
git checkout <branch_name>
```
or (modern alternative):
```bash
git switch <branch_name>
```

---

### **4. Create and switch to a new branch in one step:**
```bash
git checkout -b <branch_name>
```
or:
```bash
git switch -c <branch_name>
```

---

### **5. Rename a branch:**
```bash
git branch -m <new_branch_name>
```
If you're on the branch you want to rename:
```bash
git branch -m <old_branch_name> <new_branch_name>
```

---

### **6. Delete a branch:**
- **Delete a local branch:**
  ```bash
  git branch -d <branch_name>
  ```
  This only works if the branch has been merged. Forcing deletion:
  ```bash
  git branch -D <branch_name>
  ```

---

### **7. View remote branches:**
```bash
git branch -r
```
Shows branches on the remote repository.

---

### **8. View all branches (local and remote):**
```bash
git branch -a
```

---
